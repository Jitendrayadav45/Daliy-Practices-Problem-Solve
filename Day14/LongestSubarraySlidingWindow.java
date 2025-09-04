package Day14;

public class LongestSubarraySlidingWindow {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = 0;
        int sum = 0, maxLength = 0;

        while (end < n) {
            sum += arr[end];

            // Shrink window until sum <= k
            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }
            ///  Shrink window until sum <= k
//            if (sum > k && start <= end) {
//                sum -= arr[start];
//                start++;
//            }


            // Now window is valid
            if (sum <= k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

            end++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        System.out.println("Longest Subarray Length (Sliding Window): " + longestSubarray(arr, k));
    }
}

