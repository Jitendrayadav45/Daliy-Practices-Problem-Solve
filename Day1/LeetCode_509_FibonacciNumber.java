package Day1;

public class LeetCode_509_FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;  // example input
        System.out.println(fib(n));
    }
  //Brute Force (Recursive)
//    public static int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2); // brute force recursion
//    }
  public static int fib(int n) {
      if (n <= 1) return n;

      int first = 0;   // f(0)
      int second = 1;  // f(1)
      int sum = 0;

      for (int i = 2; i <= n; i++) {
          sum = first + second;  // f(n) = f(n-1) + f(n-2)
          first = second;        // shift values for next iteration
          second = sum;
      }

      return sum;
  }
}
