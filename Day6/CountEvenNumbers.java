package Day6;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 7, 8};
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);
    }
}
