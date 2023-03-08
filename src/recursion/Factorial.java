package recursion;

public class Factorial {
    public static long factorial(int number) {
        if (number <= 1) return 1; //  base case
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
