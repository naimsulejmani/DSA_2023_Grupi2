package advanced_sorts;

import java.lang.reflect.Array;

public class MergeSort<T extends Comparable<T>> implements Sortable<T> {

    private Class<T> clazz;

    public MergeSort(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void sort(T[] array) {
        mergeSort(array, array.length);
    }

    private void mergeSort(T[] array, int length) {
        if (length < 2) return;
        int middle = length / 2;

        T[] leftArray = (T[]) Array.newInstance(clazz, middle);
        T[] rightArray = (T[]) Array.newInstance(clazz, length - middle);

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }

        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }

        mergeSort(leftArray, leftArray.length);
        mergeSort(rightArray, rightArray.length);

        merge(array, leftArray, rightArray);
    }

    private void merge(T[] array, T[] leftArray, T[] rightArray) {
        int index = 0, leftIndex = 0, rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[index++] = leftArray[leftIndex++];
            } else {
                array[index++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < leftArray.length) {
            array[index++] = leftArray[leftIndex++];
        }

        while (rightIndex < rightArray.length) {
            array[index++] = rightArray[rightIndex++];
        }


    }
}









