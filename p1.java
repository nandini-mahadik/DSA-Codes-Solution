import java.util.Scanner;

public class p1 {
    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        p1 obj = new p1();     // create object
        obj.pattern1(n); 
    }
}
