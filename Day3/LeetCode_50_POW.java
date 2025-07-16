package Day3;

public class LeetCode_50_POW {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 3));   // 8.0
        System.out.println(myPow(2.0, -2));  // 0.25
        System.out.println(myPow(3.0, 0));   // 1.0

    }
    public static double myPow(double x, int n) {
//
              /// brute force method
//
//        long power = Math.abs((long)n);  // handle large negative values
//        double result = 1.0;
//
//        for (long i = 0; i < power; i++) {
//            result *= x;
//        }
//
//        if (n < 0) {
//            return 1.0 / result;
//        } else {
//            return result;
//        }


        /// optimize method
        double ans = 1.0;
        long power = n;   // convert to long to avoid overflow

        if (power < 0){
            power = -1 * power;
        }

        while (power > 0) {
            if (power % 2 == 1) {       // odd power
                ans = ans * x;
                power = power - 1;
            } else {                   // even power
                x = x * x;
                power = power / 2;
            }
        }

        if (n < 0) ans = 1.0 / ans;     // handle negative powers
        return ans;

    }
}
