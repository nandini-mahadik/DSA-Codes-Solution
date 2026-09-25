import java.util.Scanner;

public class p22 {

    public static void pattern22(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                // Distance from the four borders
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                // Find the minimum distance from any border
                int min = Math.min(Math.min(top, bottom),
                                   Math.min(left, right));

                // Print number
                System.out.print(n - min + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        pattern22(n);
    }
}