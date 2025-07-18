package Day6;

public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {5, 9, 2, 11, 4};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}

