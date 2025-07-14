package Day2;

public class LeetCode_258_AddDigits {
    public static void main(String[] args) {
//        int num = 58;
        System.out.println(AddDigits(25));
    }
    public static int AddDigits(int num){
        while (num >= 10){
            int sum = 0;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
