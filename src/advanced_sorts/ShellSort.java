package advanced_sorts;

import shared.Helper;

public class ShellSort<T extends Comparable<T>> implements Sortable<T> {
    @Override
    public void sort(T[] array) {
        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment /= 2;
        }
    }

    private void insertionSort(T[] listToSort, int startIndex, int increment) {
        for (int i = startIndex; i < listToSort.length; i += increment) {
            for (
                    int j = Math.min(i + increment, listToSort.length - 1);
                    j - increment >= 0;
                    j -= increment
            ) {
                if (listToSort[j].compareTo(listToSort[j - increment]) < 0) {
                    Helper.swap(listToSort, j, j - increment);
                } else break;
            }
        }
    }
}








