package searching.ushtrime;

public class Detyra1_S2 {

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int number : array) {
            if (min > number) min = number;
        }
        return min;
    }

    public static int min(int[] array, boolean returnIndex) {
        int minIndex = 0;
        int minValue = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return returnIndex ? minIndex : minValue;
    }

    public static String minV1(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return String.format("Index = %d; Value = %d", minIndex, minValue); // 1:123
    }

    public static int[] minV2(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return new int[]{minIndex, minValue}; // {1, -123}
    }

    public static Minimum minV3(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return new Minimum(minIndex, minValue);
    }


}








