package advanced_sorts;
import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] array = {88, 12, 55, 66, 77, 98, 34, 55, 1, 99};
        Sortable<Integer> sortable = new MergeSort<>(Integer.class);
        sortable.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
