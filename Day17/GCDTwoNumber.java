package Day17;

public class GCDTwoNumber {
    public static void main(String[] args) {
        System.out.println(GCD(36,60));
        System.out.println(gcd(72,30));
        System.out.println(gcdBruteForceOptimized(72,30));

    }

    /// Method 1
    public static int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
/// method 2
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /// brute force method
    public static int gcdBruteForceOptimized(int a, int b) {
        int limit = Math.min(a, b);

        for (int i = limit; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i; // first (largest) divisor found
            }
        }
        return 1;
    }


}
