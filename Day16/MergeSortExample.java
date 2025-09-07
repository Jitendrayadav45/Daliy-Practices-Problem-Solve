package Day16;

import java.util.Arrays;

public class MergeSortExample {

    static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;  // Base case: single element

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);       // Left part sort
        mergeSort(arr, mid + 1, high); // Right part sort

        merge(arr, low, mid, high);    // Merge two sorted parts
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
