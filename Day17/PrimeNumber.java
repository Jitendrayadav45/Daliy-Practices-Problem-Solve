package Day17;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(23));

    }
    /// normal method
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /// optimize method
    public static boolean isPrimeOptimize(int n) {
        if (n <= 1) return false;        // 0, 1, negative numbers -> NOT prime
        if (n == 2) return true;         // 2 is prime (special case)
        if (n % 2 == 0) return false;    // other even numbers can't be prime

        for (int i = 3; i * i <= n; i += 2) { // only odd numbers up to √n
            if (n % i == 0) {
                return false; // found a divisor, not prime
            }
        }
        return true; // no divisors found, prime
    }


}
