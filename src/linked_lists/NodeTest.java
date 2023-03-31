package linked_lists;

public class NodeTest {
    public static void main(String[] args) {
        Node nyja1 = new Node(1);
        Node nyja10 = new Node(10);
        Node nyja100 = new Node(100);
        Node nyja5 = new Node(5);
        Node nyja0 = new Node(0);

        nyja0.setNext(nyja1);
        nyja5.setNext(nyja10);
        nyja1.setNext(nyja5);
        nyja10.setNext(nyja100);

        System.out.println(nyja1);
        System.out.println(nyja1.getNext());
        System.out.println(nyja1.getNext().getNext());
        System.out.println(nyja1.getNext().getNext().getNext());
    }
}
