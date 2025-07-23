package Day9;

import java.util.Arrays;

public class LeetCode_1480_RuningSumArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));

    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];  // Add previous sum to current
        }
        return nums;

    }
}
