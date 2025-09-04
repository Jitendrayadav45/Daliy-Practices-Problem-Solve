package Day14;

public class LongestSubarrayBruteForce {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum <= k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                } else if (sum > k) {
                    break;
                    
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        System.out.println("Longest Subarray Length (Brute Force): " + longestSubarray(arr, k));
    }
}
