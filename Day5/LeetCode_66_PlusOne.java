package Day5;

import java.util.Arrays;

public class LeetCode_66_PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));


    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If current digit < 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
