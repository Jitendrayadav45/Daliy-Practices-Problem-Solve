package Day17;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int original = n;
        int count = 0;

        // Step 1: Count digits
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }


        int sum = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count); // digit^count
            temp /= 10;
        }

        return sum == original;
    }

    public static boolean isArmstrongNumber(int n) {

        int original = n;
        int digits = String.valueOf(n).length();  // Count digits
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(12));  // false
        System.out.println(isArmstrong(0));   // true (0^1 = 0)
        System.out.println(isArmstrong(100)); // false
        System.out.println(isArmstrongNumber(153));
    }
}

