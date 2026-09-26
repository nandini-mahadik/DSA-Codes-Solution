//counting the digits of number and returning it

import java.util.Scanner;

public class count_digits {
    public static void count(int n){
        int c = 0;
        while(n>0){
            c = c+1;
            n = n / 10;
            
        }
        System.out.println("Total digits prenent in number are: " +c);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        count(n);

    }
}
