package Day16;

import java.util.Arrays;

public class RecursiveBubble {


//    static void recursiveBubbleSort(int[] arr, int n) {
//        // base case
//        if (n == 1) return;
//
//
//        for (int j = 0; j < n - 1; j++) {
//            if (arr[j] > arr[j + 1]) {
//                int tmp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = tmp;
//            }
//        }
//
//
//        recursiveBubbleSort(arr, n - 1);
//    }


    static void recursiveBubbleSortOptimized(int[] arr, int n) {
        if (n == 1) return;

        boolean swapped = false;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                swapped = true;
            }
        }

        if (!swapped) return;         // already sorted → early exit
        recursiveBubbleSortOptimized(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Before: " + Arrays.toString(arr));
//        recursiveBubbleSort(arr, arr.length);
        recursiveBubbleSortOptimized(arr, arr.length);
        System.out.println("After : " + Arrays.toString(arr));
    }
}
