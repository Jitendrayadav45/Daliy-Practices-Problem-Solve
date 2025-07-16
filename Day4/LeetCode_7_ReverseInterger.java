package Day4;

public class LeetCode_7_ReverseInterger {
    public static void main(String[] args) {
        System.out.println(reverse(321));

    }
    public static int reverse(int x) {

        // long rev = 0;

        // while (x != 0) {
        //     int digit = x % 10;
        //     rev = rev * 10 + digit;
        //     x /= 10;
        // }
        //    if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
        //     return 0;
        // }

        // return (int) rev;  // safe to cast

        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // manual overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;

    }
}
