package Day10;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


//        System.out.println(Arrays.toString(ReverseArray(arr)));


//        reverseInPlace(arr);
//        System.out.println(Arrays.toString(arr));

//        reverseRecursive(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        reverseArrayUsingSwap(arr);
        System.out.println(Arrays.toString(arr));

    }

    /// Method - 1
    /// using duplicate value new array
//    public static int[] ReverseArray(int[] arr){
//        int n = arr.length;
//        int [] reversed = new int[n];
//        for (int i = 0; i < n; i++){
//            reversed[i] = arr[n-1-i];
//        }
//        return reversed;
//
//    }
    /// Method - 2
    /// This Method is use same array but reverse value do not use any another array
//    public static void reverseInPlace(int[] arr) {
//        int start = 0, end = arr.length - 1;
//
//        while (start < end) {
//            // Swap arr[start] and arr[end]
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//    }
/// Method - 3
 /// Using Recursion method solve
//    public static void reverseRecursive(int[] arr, int start, int end) {
//        if (start >= end) return;
//
//        // Swap
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//
//        reverseRecursive(arr, start + 1, end - 1);
//    }

    /// Method - 4
    /// Using swap Method
    static void reverseArrayUsingSwap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

}
