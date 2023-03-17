package elementary_sorts;

import shared.Helper;

public class InsertionSort {
    public static void binaryInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int position = binarySearch(array, key, 0, i - 1);

            for (int j = i - 1; j >= position; j--) {
                array[j + 1] = array[j];
            }

            array[position] = key;
        }
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        if (high <= low) {
            return (key > array[low]) ? (low + 1) : low;
        }

        int mid = (low + high) / 2;

        if (key == array[mid]) {
            return mid + 1;
        }

        if (key > array[mid]) {
            return binarySearch(array, key, mid + 1, high);
        }

        return binarySearch(array, key, low, mid - 1);
    }

    public static void insertionSort(int[] array) {
        for (int pointer = 1; pointer < array.length; pointer++) {
            int current = array[pointer];
            int position = pointer;
            while (position > 0 && array[position - 1] > current) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
        }
    }

    public static void main(String[] args) {

        int[] array = Helper.generateArray(10, 1, 100);
        System.out.println("Vargu i pasortuar: ");
        Helper.print(array);
        insertionSort(array);
        System.out.println("Vargu i sortuar: ");
        Helper.print(array);


    }
}







