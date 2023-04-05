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

    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }

    public void removeLast() {

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

    }

    public void addBeforeIndex(int index, int data) {

    }

    public void removeByIndex(int index) {

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












