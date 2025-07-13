package Day1;

public class LeetCode_1837_DigitSum {
    public static void main(String[] args) {
        System.out.println(sumBase(28,3));
    }
    public static int sumBase(int n, int k) {
        int sum = 0;

        while (n > 0) {
            sum += n % k; // get last digit in base k
            n /= k;       // move to next digit
        }

        return sum;
    }
}
