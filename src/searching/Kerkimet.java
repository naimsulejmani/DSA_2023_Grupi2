package searching;

public class Kerkimet {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 233, 1233, 123214};
        System.out.println("Kerkimi SEQUENCIAL apo LINEAR");
        System.out.println("-------------------------");
        System.out.println(contains(array, 100));
        System.out.println(contains(array, -1));

        System.out.println(indexOf(array, 100));
        System.out.println(indexOf(array, -1));

        System.out.println("Kerkimi BINAR");
        System.out.println("-------------------------");
        System.out.println(binarySearch(array, 100));
        System.out.println(binarySearch(array, -1));
    }

    //Kerkimi sekuencial
    public static boolean contains(int[] array, int element) {
        for (int number : array) {
            if (number == element) return true;
        }
        return false;
    }

    //Kerkimin sekuencial
    public static int indexOf(int[] array, int element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) return index;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int element) {
        int low, mid, high;
        low = 0;
        high = array.length - 1;
        while (high >= low) {
            mid = (low + high) / 2;

            if (array[mid] == element) return mid;

            if (array[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}








