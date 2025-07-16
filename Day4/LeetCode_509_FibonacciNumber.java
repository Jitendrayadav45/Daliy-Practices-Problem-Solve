package Day4;

public class LeetCode_509_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));

    }
    public static int fib(int n) {

        /// base method
        // if(n <=1){
        //     return n;
        // }
        // else{
        //      return fib(n - 1) + fib(n - 2);
        // }

        /// optimize way
        if (n <= 1) return n;

        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;

    }
}
