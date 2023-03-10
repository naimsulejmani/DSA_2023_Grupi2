package recursion;

public class BinaryRecursion {
    public static int binarySearch(int[] array, int element, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (element == array[mid])
            return mid;
        else if (element < array[mid])
            return binarySearch(array, element, low, mid - 1);
        else
            return binarySearch(array, element, mid + 1, high);
    }

    public static int binarySearch(int[] array, int element) {
        return binarySearch(array, element, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 20, 23, 213, 1234, 12314, 12341213, 22341213};
        System.out.println(binarySearch(array,22341213));
        System.out.println(binarySearch(array,22341214));
    }
}








