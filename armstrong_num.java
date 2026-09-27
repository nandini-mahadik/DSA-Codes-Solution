import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        //int x = 153;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int original = x;
        int sum = 0;
        int rev = 0;

        while (x > 0) {
            int ld = x % 10;
            sum += (int) Math.pow(ld, 3);
            rev = (rev * 10) + ld;
            x = x / 10;
        }

        if (original == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
