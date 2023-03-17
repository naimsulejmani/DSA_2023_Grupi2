package elementary_sorts;

import shared.Helper;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean hasAnySwap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                //elementi ne j eshte me i madh se elementi vijues j+1
                if (array[j] > array[j + 1]) {
                    // SWAP ELEMENT
                    hasAnySwap = true;
//                    int temp = array[j]; // ruaje array-j ne variablen e perkoheshme
//                    array[j] = array[j + 1]; // ne array-j vendose variablen vijuese
//                    array[j + 1] = temp; // ne varibalen vijuese vendose vaiablen e perkoheshme
                    Helper.swap(array, j, j + 1);
                }
            }
            if (!hasAnySwap) break;
        }
    }

    public static void main(String[] args) {
        int[] array = Helper.generateArray(10, 1, 100);
        System.out.println("Vargu i pasortuar: ");
        Helper.print(array);
        bubbleSort(array);
        System.out.println("Vargu i sortuar: ");
        Helper.print(array);

    }
}






