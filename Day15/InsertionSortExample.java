package Day15;

import java.util.Arrays;

public class InsertionSortExample {

    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j-1] and arr[j]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
//                System.out.println("runs");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        insertion_sort(arr, n);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
