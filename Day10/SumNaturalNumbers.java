package Day10;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        int result = Sum(5);
        System.out.println(result);

    }
    public static int Sum(int n){
        if (n == 0){
            return 0;
        }

        return n  + Sum(n - 1);
    }
}
