import java.util.Scanner;

public class p16 {
    public static void pattern16(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                
            }
            System.out.println();
            ch++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 

        pattern16(n);
    }
}
