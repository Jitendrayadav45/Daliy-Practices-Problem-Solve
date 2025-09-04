package Day14;

import java.util.Arrays;

public class FrequencyOfMostFrequent {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Step 1
        int n = nums.length;
        long windowSum = 0;
        int left = 0, result = 0;

        for (int right = 0; right < n; right++) {
            windowSum += nums[right];

            long cost = (long) nums[right] * (right - left + 1) - windowSum;

            while (cost > k) {
                windowSum -= nums[left];
                left++;
                cost = (long) nums[right] * (right - left + 1) - windowSum;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        int ans = maxFrequency(nums, k);
        System.out.println("Final Answer: " + ans);
    }
}

