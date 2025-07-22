package Day8;

public class LeetCode_1295_FindNumbers {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896, 23,24}));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            // Count digits manually
            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
