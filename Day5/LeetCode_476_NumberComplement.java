package Day5;

public class LeetCode_476_NumberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));

    }
    public static int findComplement(int num) {
        int mask = 0;
        int temp = num;

        // Step 1: Create a mask with all 1's same length as num
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        // Step 2: Flip all bits using XOR
        return num ^ mask;
    }

}
