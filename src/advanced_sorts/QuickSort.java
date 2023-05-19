package advanced_sorts;

import shared.Helper;

public class QuickSort<T extends Comparable<T>> implements Sortable<T> {
    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] listToSort, int low, int height) {
        if (low >= height) return;
        int pivot = partition(listToSort, low, height);
        quickSort(listToSort, low, pivot - 1);
        quickSort(listToSort, pivot + 1, height);
    }

    private int partition(T[] listToSort, int low, int height) {
        T pivot = listToSort[low];
        int l = low;
        int h = height;
        while (l < h) {
            while (listToSort[l].compareTo(pivot) <= 0 && l < h) l++;
            while (listToSort[h].compareTo(pivot) > 0) h--;
            if (l < h) Helper.swap(listToSort, l, h);
        }
        Helper.swap(listToSort, low, h);
        System.out.println("Pivot = " + pivot);
        return h;
    }
}








