import java.util.Scanner;

public class k_rotate {
    public static void k_left_rotation(int arr[], int n, int d) {
        d = d % n;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter elemnets of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter count of d: ");
        int d = sc.nextInt();
        k_left_rotation(arr, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // return 0;

    }
}
