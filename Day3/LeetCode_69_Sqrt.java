package Day3;

public class LeetCode_69_Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(40));

    }
    public static int mySqrt(int x) {
        if ( x == 0 || x == 1){
            return x;
        }
        int root = 0;
        for (int i = 1; i <= x; i++){
            if ( (long)i * i <= x){
                root = i;
            }
            else {
                break;
            }
        }
        return root;

    }
}
