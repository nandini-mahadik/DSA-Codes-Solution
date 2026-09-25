import java.util.Scanner;

public class p20 {

    public static void pattern20(int n) {

        // Total rows = 2*n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars;

            // Number of stars
            if (i <= n) {
                stars = i;
            } else {
                stars = 2 * n - i;
            }

            // Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - stars); j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        pattern20(n);
    }
}