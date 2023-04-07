package linked_lists.generics;

import java.time.LocalDate;

public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> nodeInt = new Node<>(10);
        nodeInt.setData(123);
        System.out.println(nodeInt);

        Node<String> nodeStr = new Node<>("Aldi");
        System.out.println(nodeStr);

        Node<LocalDate> nodeDate = new Node<>(LocalDate.now());
        System.out.println(nodeDate);


    }
}
