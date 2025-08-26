package Day10;

public class RecursionPrintNumber2 {
    public static void main(String[] args) {
        Number(5);
    }

    public static void Number(int n) {
        if (n == 0) {
            return;   // base case
        }
        System.out.println(n);   // print current n
        Number(n - 1);           // recursive call with n-1
    }
}
