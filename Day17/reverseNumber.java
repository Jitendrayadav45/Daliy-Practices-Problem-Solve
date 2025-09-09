package Day17;

public class reverseNumber {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
//        System.out.println(reverseNumber(123,0));
        System.out.println(reverseIterativeSafe(34567));


    }
//    public static int reverse(int num){
//        int rev = 0;
//        while (num > 0) {
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num = num / 10;
//        }
//        return rev;
//    }



    public static int reverseNumber(int n, int rev) {
        if (n == 0) return rev;
        rev = rev * 10 + n % 10;
        return reverseNumber(n / 10, rev);
    }


    public static int reverseIterativeSafe(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;

            // Manual overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }
}
