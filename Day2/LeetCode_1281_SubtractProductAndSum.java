package Day2;

public class LeetCode_1281_SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while ( n > 0){
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        return product - sum;
    }
}
