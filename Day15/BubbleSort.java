package Day15;

import java.util.Arrays;

public class BubbleSort {

    /// Method 1 Basic approch of bubble sort
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {   // Outer loop for passes
//            for (int j = 0; j < n - i - 1; j++) {  // Inner loop for comparisons
//                if (arr[j] > arr[j + 1]) {  // Swap if out of order
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }

    /// Method 2 optimization

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            boolean swapped = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: if no swaps, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        bubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

