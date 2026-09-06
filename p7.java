import java.util.Scanner;

public class p7 {
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void main(String args[]) {
        System.err.println("Input: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        pattern7(n);
    }
}
