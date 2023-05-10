package advanced_sorts;

import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        String[] names = {"Fidan", "Azem", "Nikolin", "Petrit", "Kadrije", "Mihrije", "Zhaklina", "Elton", "Alban"};
        Sortable<String> sortable = new HeapSort<>();
        sortable.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
