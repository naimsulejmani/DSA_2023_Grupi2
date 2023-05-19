package advanced_sorts;

public class SortableTest {
    public static void main(String[] args) {
        String[] ekipet = {"Real Madrid", "Arsenal", "Barcelona", "Bayern Munich", "Chelsea", "Man City"};
        sort(ekipet, new QuickSort<>());

    }

    public static <T extends Comparable<T>> void sort(T[] array, Sortable<T> sortable) {
        sortable.sort(array);
    }

}
