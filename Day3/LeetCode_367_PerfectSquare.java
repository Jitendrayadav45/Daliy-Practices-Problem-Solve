package Day3;

public class LeetCode_367_PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));

    }
    public static boolean isPerfectSquare(int num) {
        if (num == 0){
            return true;
        }
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

}
