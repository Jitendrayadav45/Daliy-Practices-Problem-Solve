package Day16;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // First element as pivot
        int i = low + 1;
        int j = high;

        // Move i forward and j backward until they cross each other
        while (i <= j) {
            // Find element greater than pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Find element smaller than pivot
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            // Swap elements if i and j have not crossed
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place pivot in its correct position
        swap(arr, low, j);
        return j; // Return pivot index
    }

    // Swap function to make code cleaner
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // QuickSort function (recursive)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);  // Sort left part
            quickSort(arr, pivotIndex + 1, high); // Sort right part
        }
    }

    // Main method to test quicksort
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}

