import java.util.Scanner;

public class p17 {
    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <=2*i+1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        pattern17(n);
    }
}
