package elementary_sorts;

import shared.Helper;

public class SelectionSort {
    public static int minIndexValue(int[] array, int fromIndex) {
        int minIndex = fromIndex;
        for (int i = fromIndex + 1; i < array.length; i++) {
            if (array[minIndex] > array[i])
                minIndex = i;
        }
        return minIndex;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = minIndexValue(array, i);
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.printf("Hapi %d: ", i + 1);
            Helper.print(array);
        }
    }

    public static void main(String[] args) {
        int[] array = Helper.generateArray(10, 1, 100);
        System.out.println("Vargu i pasortuar: ");
        Helper.print(array);
        selectionSort(array);
        System.out.println("Vargu i sortuar: ");
        Helper.print(array);
    }
}








