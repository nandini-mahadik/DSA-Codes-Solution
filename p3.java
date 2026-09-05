import java.util.Scanner;

public class p3 {
    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
               
            }
            System.out.println();
        }
        

    }

    public static void main(String args[]) {
        System.out.println("enter value: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        p3 p = new p3();
        p.pattern3(n);

    }
}
