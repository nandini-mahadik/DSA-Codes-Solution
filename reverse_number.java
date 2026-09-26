import java.util.Scanner;

public class reverse_number {
    public static void rev_num(int n) {
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);

            n = n / 10;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        rev_num(n);

    }
}
