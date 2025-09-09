package Day17;

import java.util.*;

public class Divisors {
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors; // already in sorted order because i increasing hai
    }

    public static List<Integer> findDivisorsOptimize(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {  // avoid duplicate for perfect square
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(findDivisors(6)); // [1, 2, 3, 6]
        System.out.println(findDivisors(8)); // [1, 2, 4, 8]
        System.out.println(findDivisorsOptimize(9));
    }
}
