package linked_lists;

import java.util.Arrays;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        System.out.println(lista.isEmpty());
        lista.addFirst(100);
        lista.addFirst(10);
        lista.addFirst(1);
        System.out.println(lista.isEmpty());
        lista.print();
        System.out.println(lista.isEmpty());
        System.out.println("-----------------------------------");
        lista.removeFirst();
        System.out.println(Arrays.toString(lista.toArray()));
//        System.out.println(lista.findByIndex(0));
////        lista.print();
//        System.out.println(lista.findByData(10));
//        System.out.println(lista.findByData(1000));
//        System.out.println(lista.contains(10));
//        System.out.println(lista.contains(1000));
//        System.out.println(lista.size());
    }
}









