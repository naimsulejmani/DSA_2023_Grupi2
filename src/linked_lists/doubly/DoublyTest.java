package linked_lists.doubly;

public class DoublyTest {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();
        lista.addLast(1);
        lista.addFirst(0);
        lista.addLast(10);
        lista.addLast(100);
        lista.printDesc();

        System.out.println("--------------");
        System.out.println(lista.findByIndex(2));
    }
}
