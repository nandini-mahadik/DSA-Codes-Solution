import java.util.Scanner;

public class p19 {

    public static void pattern19(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        pattern19(n);
    }
}