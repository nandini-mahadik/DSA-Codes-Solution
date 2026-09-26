import java.util.Scanner;

public class digit_extraction {
    public static void extract(int n){
        while(n>0){
            int lastdigit = n % 10;
            System.out.println(lastdigit);

            n = n / 10;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        extract(n);

    }
}
