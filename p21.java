import java.util.Scanner;

public class p21 {

    public static void pattern21(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                // First row, last row, first column, last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        pattern21(n);
    }
}