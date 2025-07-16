package Day4;

import static java.lang.Math.pow;

public class LeetCode_ArmstrongCheck {
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));

    }
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();  // Count digits
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}
