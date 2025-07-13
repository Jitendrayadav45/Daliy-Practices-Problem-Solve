package Day1;

public class LeetCode_231_powerOfTwo {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(IsPowerOfTwo(n));
    }
    public static boolean IsPowerOfTwo( int n){
        // method 1


//        if (n <= 0) {
//            return false;
//        }
//        while (n != 1){
//            if(n % 2 != 0){
//                return false;
//            }
//            else {
//                n = n / 2;
//            }
//        }
//        return true;


        // method 2


//        long i = 1;
//        if(n <= 0) {
//            return false;
//        }
//        while (i < n){
//            i = i * 2;
//        }
//        return i == n;


//       method 3

        return n > 0 && (n & (n - 1)) == 0;
    }
}
