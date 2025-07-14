package Day2;

public class LeetCode_461_HammingDistance {
    public static void main(String[] args) {
        System.out.println(HammingDistance(5,15));

    }
    public static int HammingDistance(int x, int y){
        int XOR = x ^ y;
        int count = 0;
        while ( XOR > 0){
            if ((XOR & 1) == 1){
                count++;
            }
            XOR = XOR >> 1;
        }
        return count;
    }
}
