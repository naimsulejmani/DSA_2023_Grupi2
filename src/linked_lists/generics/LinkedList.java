package linked_lists.generics;

public class LinkedList<T> {
    private Node<T> head;
    private int counter;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
        counter++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty())
            head = newNode;
        else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        counter++;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    private Node<T> pop() {
        if (isEmpty()) return null;
        Node<T> topNode = head;
        head = head.getNext();
        return topNode;
    }

    public T popElement() {
        if (isEmpty()) return null;
        return pop().getData();
    }


}














