package Day8;

public class LeetCode_1752_CheckArraySortAndRotated {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 1, 2};
        System.out.println(check(nums));

    }
        public static boolean check(int[] nums) {
            int count = 0; // Count breaks

            for (int i = 0; i < nums.length; i++) {
                int next = nums[(i + 1) % nums.length]; // wrap-around
                if (nums[i] > next) {
                    count++;
                }
            }

            return count <= 1; // max one break allowed
        }
}

