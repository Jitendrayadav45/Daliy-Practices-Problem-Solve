package Day10;

public class RecursionPrintNumber {
    public static void main(String[] args) {
        Number(0, 4);   // start = 0, end = 4
    }

    public static void Number(int start, int n) {
        // base case
        if (start >= n) {
            return;
        }

        System.out.println(start);
        Number(start + 1, n);
    }
}
