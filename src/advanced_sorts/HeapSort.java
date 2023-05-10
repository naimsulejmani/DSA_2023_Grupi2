package advanced_sorts;

public class HeapSort<T extends Comparable<T>> implements Sortable<T> {
    @Override
    public void sort(T[] array) {
        //numri i iterimeve qe duhet me i bo qe me u kriju heap arrray (stogu)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private void heapify(T[] array, int length, int currentIndex) {
        int largest = currentIndex;
        int leftIndex = currentIndex * 2 + 1;
        int rightIndex = leftIndex + 1;

        if (leftIndex < length && array[leftIndex].compareTo(array[largest]) > 0) {
            largest = leftIndex;
        }
        if (rightIndex < length && array[rightIndex].compareTo(array[largest]) > 0) {
            largest = rightIndex;
        }

        if (largest != currentIndex) {
            T temp = array[currentIndex];
            array[currentIndex] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }
}
