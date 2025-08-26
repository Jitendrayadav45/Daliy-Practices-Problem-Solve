package Day10;

public class FibonacciSeries {
    public static void main(String[] args) {
//        System.out.println(Fib(5));
        System.out.println(Fiboo(5));

    }

    ///  With Recursion
//    public static int Fib(int n){
//        if(n <= 1){
//            return n;
//        }
//        else {
//            return Fib(n-1) + Fib(n-2);
//        }
//    }

    /// Without Recusrion
    public static int Fiboo(int n){
        if (n <= 1){
            return n;
        }
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
