package hashtables;

import java.util.ArrayList;

public abstract class AbstractHashTable<K, V> {
    protected int size;
    protected int capacity;

    public AbstractHashTable(int capacity) {
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public abstract void clear();

    public abstract boolean containsKey(K key);

    public abstract boolean containsValue(V value);

    public abstract ArrayList<Node<K, V>> elements();

    public abstract V get(K key);

    public boolean isEmpty() {
        return size == 0;
    }

    public abstract void put(K key, V value);

    public abstract void remove(K key, V value);

    public abstract void remove(K key);

    public abstract void replace(K key, V value);

    public abstract ArrayList<K> keys();

    public abstract ArrayList<V> values();

}







