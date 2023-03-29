package adts;

import shared.Helper;

public class ProceduralAbstraction {
    public static void main(String[] args) {
        // int[] array = {1,2,3};
        int[] array = Helper.generateArray(100, 1, 1000);

        System.out.printf("Total numra: %d%n", array.length);
        int shuma = sum(array);
        System.out.printf("Shuma: %d%n", shuma);
        int minimumi = min(array);
        System.out.printf("Minimum: %d%n", minimumi);
    }

    private static int min(int[] array) {
        return 0;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}








