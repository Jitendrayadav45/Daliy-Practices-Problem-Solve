package Day15;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;

            /// index of the minimum element
            for (int j = i + 1; j <= n - 1 ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // loop ke ander check kerne vala

                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

