package linked_lists.generics;

import java.util.ArrayList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> emrat = new LinkedList<>();
        emrat.addFirst("mish");
        emrat.addLast("suxhuk");
        emrat.addFirst("kajmak");
        emrat.print();
      //  Node<String> nyjaPop = emrat.pop();
        //System.out.println("POP: " + nyjaPop);
        System.out.println("POP Element: " + emrat.popElement());

        ArrayList l = new ArrayList();

    }
}
