package Day17;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(Count(1122222));
        System.out.println(countDigits(12));
        System.out.println(countDigitsMath(123));

    }

    ///  method 1
    public static int Count(int num){
        if (num == 0) return 1;

        int count = 0;
        while (num > 0){
            count++;
            num/=10;
        }
        return count;
    }
  /// method 2
    public static int countDigits(int nun) {
        return String.valueOf(nun).length();
    }
    /// method 3
    public static int countDigitsMath(int n) {
        if (n == 0) return 1;
        return (int)(Math.log10(n)) + 1;
    }
}
