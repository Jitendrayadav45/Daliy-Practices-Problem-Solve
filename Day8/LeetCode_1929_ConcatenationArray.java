package Day8;

import java.util.Arrays;

public class LeetCode_1929_ConcatenationArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));

    }

        public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] result = new int[2 * n]; // New array with 2x size

            for (int i = 0; i < n; i++) {
                result[i] = nums[i];           // First copy
                result[i + n] = nums[i];       // Second copy
            }

            return result;

        }
}
