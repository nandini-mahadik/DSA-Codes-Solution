import java.util.Scanner;

public class p5 {
    public void pattern5(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        System.out.println("enter value: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        p5 p = new p5();
        p.pattern5(n);

    }
}
