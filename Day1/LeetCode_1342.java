package Day1;

public class LeetCode_1342 {
    public static void main(String[] args) {
        int num = 14; // Example input
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;  // even
            } else {
                num = num - 1;  // odd
            }
            steps++;  // count each operation
        }

        return steps;
    }
}
