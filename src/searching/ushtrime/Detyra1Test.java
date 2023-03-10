package searching.ushtrime;

public class Detyra1Test {
    public static void main(String[] args) {
        int[] array = {12, 123, 121, 123, 3211, 123, -123, 123};
        System.out.println(Detyra1_S2.min(array)); // min value
        System.out.println(Detyra1_S2.min(array, true)); // min index
        System.out.println(Detyra1_S2.min(array, false)); // min value
        System.out.println(Detyra1_S2.minV1(array));
        System.out.println(Detyra1_S2.minV2(array)[0]);
        System.out.println(Detyra1_S2.minV2(array)[1]);
        System.out.println(Detyra1_S2.minV3(array).getIndex());
        System.out.println(Detyra1_S2.minV3(array).getValue());


    }
}
