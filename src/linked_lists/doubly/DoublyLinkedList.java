package linked_lists.doubly;

public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void printDesc() {
        DNode temp = tail;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getPrev();
        }
    }

    public DNode findByIndex(int index) {
        if (index >= size || index < 0) return null;
        DNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addAfterIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
        } else {
            DNode newNode = new DNode(data);
            DNode prevNode = findByIndex(index);

            newNode.setNext(prevNode.getNext());
            newNode.setPrev(prevNode);

            prevNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);

        }

        //TODO: Plus pike ne provim
        // Per Elton Kaqiu per idene si ne vijim
        // Te krijohet nje metode e cila i ben lidhjet
        // e doubly linked list ku ja japim si parameter node te cilet
        // duhet t elidhen apo te fsihen
    }


}








