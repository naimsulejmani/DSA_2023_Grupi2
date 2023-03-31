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
            if (temp.getData() == data)
                return temp;
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

}












