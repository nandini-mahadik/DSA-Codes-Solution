import java.util.Scanner;

public class p6 {
    public void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            
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

        p6 p = new p6();
        p.pattern6(n);

    }
}
