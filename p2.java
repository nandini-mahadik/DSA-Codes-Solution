import java.util.Scanner;

public class p2 {
    public void pattern2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("enter value: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        p2 obj = new p2();     // create object
        obj.pattern2(n); 
    }
}
