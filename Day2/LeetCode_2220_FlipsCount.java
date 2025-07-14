package Day2;

public class LeetCode_2220_FlipsCount {
    public static void main(String[] args) {
        System.out.println(FlipsCountNumber(10,7));

    }
    public static int FlipsCountNumber(int start, int goal){
        int XOR = start ^ goal;
        int flip = 0;
        while ( XOR > 0){
            if ((XOR & 1) == 1){
                flip++;
            }
            XOR = XOR >> 1;
        }
        return flip;
    }
}
