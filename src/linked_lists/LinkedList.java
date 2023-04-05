package linked_lists;

public class LinkedList {
    private int size = 0;
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public Node findByData(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public boolean contains(int data) {
        return findByData(data) != null;
    }

    public int size() {
        return size;
//        Node temp = head;
//        int counter = 0;
//        while (temp != null) {
//            counter++;
//            temp = temp.getNext();
//        }
//        return counter;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            // Ideja e Elton Kaqiu ✅
            //  addAfterIndex(size - 1, data);

            // Ideja e Altin Hysa
            Node temp = findByIndex(size - 1);
            temp.setNext(newNode);

// OLD LOGIC IF WE DONT HAVE size instance variable
//            Node temp = head;
//            while(temp.getNext()!=null) {
//                temp = temp.getNext();
//            }
//            temp.setNext(newNode);
        }
        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (size == 1) {
                clear();
                size--;
            } else {
                removeByIndex(size - 1);
            }
        }
    }

    public Node findByIndex(int index) {

        if (index < 0 || index >= size) return null;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addAfterIndex(int index, int data) {
        Node newNode = new Node(data);
        if (isEmpty() && index == 0) {
            head = newNode;
            size++;
        } else {
            Node prevNode = findByIndex(index);
            if (prevNode != null) {
                newNode.setNext(prevNode.getNext());
                prevNode.setNext(newNode);
                size++;
            }
        }
    }

    public void addBeforeIndex(int index, int data) {
        Node newNode = new Node(data);
        if (isEmpty() && index == 1) {
            head = newNode;
            size++;
        } else {
            addAfterIndex(index - 1, data);
        }
    }

    public void removeByIndex(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                removeFirst();
            } else {
                Node deletedNode = findByIndex(index);
                if (deletedNode != null) {
                    Node prevNode = findByIndex(index - 1);
                    prevNode.setNext(deletedNode.getNext());
                    deletedNode.setNext(null);
                    size--;
                }
            }
        }
    }

    public void clear() {
        head = null;
    }

    public Node[] toArray() {
        if (isEmpty()) return new Node[0]; // ose return null;
        Node[] array = new Node[size];

        Node temp = head;

        for (int i = 0; i < size; i++) {
            array[i] = temp;
            temp = temp.getNext();
        }

        return array;
    }


}












