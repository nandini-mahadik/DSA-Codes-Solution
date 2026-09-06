import java.util.Scanner;

public class p11 {
    public static void pattern11(int n) {
        int c = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                c = 1;
            } else {
                c = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c = 1 - c;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        pattern11(n);
    }
}
