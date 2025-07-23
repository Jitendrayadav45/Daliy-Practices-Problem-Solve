package Day9;

import java.util.Arrays;

public class LeetCode_1470_ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }
        public static int[] shuffle(int[] nums, int n) {
            int[] result = new int[2 * n];
            int index = 0;

            for (int i = 0; i < n; i++) {
                result[index++] = nums[i];     // x part
                result[index++] = nums[i + n]; // y part
            }

            return result;

        }
}
