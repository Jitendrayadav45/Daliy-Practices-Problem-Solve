package Day9;

import java.util.Arrays;

public class LeetCode_1920_PermutationArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));

    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];  //logic
        }

        return ans;

    }
}
