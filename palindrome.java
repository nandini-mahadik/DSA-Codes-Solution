import java.util.Scanner;

public class palindrome {
    public static void cal_pal(int x) {
        if (x < 0) {
            System.out.println("False");
        }

        int original = x;
        int rev = 0;
        while (x > 0) {
            int ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }
        if (original == rev) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        cal_pal(x);
    }
}
