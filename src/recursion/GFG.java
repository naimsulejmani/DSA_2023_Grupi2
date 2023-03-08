package recursion;

public class GFG {
    static void printFun(int number) {
        if (number < 1) return;
        else {
            System.out.printf("%d ", number);
            printFun(number - 1);
            System.out.printf("%d ", number);
        }
    }
    public static void main(String[] args) {
        printFun(4);
    }
}

