public class largestEle {
    public static int largest_element(int arr[]) {

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];

            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 5, 3 };

        System.out.println(largest_element(arr));
    }
}
