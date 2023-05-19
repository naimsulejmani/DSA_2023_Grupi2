package advanced_sorts;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        String[] ekipet = {"Real Madrid", "Arsenal", "Barcelona", "Bayern Munich", "Chelsea", "Man City"};
        Sortable<String> sortable = new QuickSort<>();
        sortable.sort(ekipet);
        System.out.println(Arrays.toString(ekipet));
    }
}
