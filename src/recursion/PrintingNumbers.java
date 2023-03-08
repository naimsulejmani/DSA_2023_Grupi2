package recursion;

public class PrintingNumbers {
    public static void printo(int number) {
        if(number>10) {
            return;
        }
        System.out.printf("%d ",number);
        printo(number+1);
    }

    public static void main(String[] args) {
        printo(5);
    }
}
