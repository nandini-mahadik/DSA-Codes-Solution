
import java.util.Scanner;

public class p4 {
    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
               
            }
            System.out.println();
        }
        

    }

    public static void main(String args[]) {
        System.out.println("enter value: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        p4 p = new p4();
        p.pattern3(n);

    }
}
