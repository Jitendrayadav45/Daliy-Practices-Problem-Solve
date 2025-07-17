package Day5;

import java.util.Arrays;

public class LeetCode_1317_GetNOZeroInterger {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));

    }
    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            if (nonZero(n - a) && nonZero(a)) {
                return new int[]{n - a, a};
            }
        }
        return new int[0]; // fallback
    }

    // This method should be outside the getNoZeroIntegers method
    public static boolean nonZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}

