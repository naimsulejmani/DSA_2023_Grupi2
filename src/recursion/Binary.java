package recursion;

public class Binary {
    public static String convert(int number) {
        if (number <= 1)
            return String.valueOf(number);// return "" + number;
        return convert(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        System.out.println(convert(101));
        System.out.println(convert(4));
    }

}












