package hashtables;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> extends AbstractHashTable<K, V> {
    private LinkedList<Node<K, V>>[] hashTable = null;

    public HashTable(int capacity) {
        super(capacity);
        hashTable = new LinkedList[capacity];
    }

    public HashTable() {
        this(10);
    }

    @Override
    public void clear() {
        hashTable = new LinkedList[capacity];
//        for (int i = 0; i < capacity; i++) {
//            hashTable[i] = null;
//        }
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        return keys().contains(key);
    }

    @Override
    public boolean containsValue(V value) {
        return values().contains(value);
    }

    @Override
    public ArrayList<Node<K, V>> elements() {
        return null;
    }

    @Override
public V get(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> linkedList = hashTable[index];

        if (linkedList != null) {
            for (Node<K, V> node : linkedList) {
                if (node.getKey().equals(key)) return node.getValue();
            }
        }
        throw new IllegalArgumentException("Nuk ka element me kete key ne hashtabele!");
    }

    @Override
    public void put(K key, V value) {
        int index = hash(key);

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].addLast(new Node<>(key, value));
            size++;
            return;
        }

        for (Node<K, V> node : hashTable[index]) {
            if (node.getKey().equals(key)) {
                throw new IllegalArgumentException("Celesi vetemse ekziston, ju lutem perdorni replace!");
            }
        }
        hashTable[index].addLast(new Node<>(key, value));
        size++;
    }

    @Override
    public void remove(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void replace(K key, V value) {
        int index = hash(key);
        LinkedList<Node<K, V>> linkedList = hashTable[index];
        if (linkedList != null) {
            for (Node<K, V> node : linkedList) {
                if (node.getKey().equals(key)) {
                    node.setValue(value);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Nuk u gjet elementi me kete key per tu bere replace!");
    }

    @Override
    public ArrayList<K> keys() {
        ArrayList<K> keys = new ArrayList<>();
        for (LinkedList<Node<K, V>> linkedList : hashTable) {
            if (linkedList != null) {
                for (Node<K, V> node : linkedList) {
                    keys.add(node.getKey());
                }
            }
        }
        return keys;
    }

    @Override
    public ArrayList<V> values() {
        ArrayList<V> values = new ArrayList<>();
        for (LinkedList<Node<K, V>> linkedList : hashTable) {
            if (linkedList != null) {
                for (Node<K, V> node : linkedList) {
                    values.add(node.getValue());
                }
            }
        }
        return values;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
        // return Math.abs(key.hashCode() % capacity);
    }


}






