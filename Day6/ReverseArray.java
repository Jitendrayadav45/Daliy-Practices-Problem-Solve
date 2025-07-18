package Day6;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
