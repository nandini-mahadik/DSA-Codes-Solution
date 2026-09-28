import java.util.Scanner;

public class lcm_numbers {

    public static int GCD(int n1, int n2) {

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    public static void LCM(int n1, int n2) {

        int gcd = GCD(n1, n2);

        int lcm = (n1 * n2) / gcd;

        System.out.println("LCM of given number is = " + lcm);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        LCM(n1, n2);

        sc.close();
    }
}