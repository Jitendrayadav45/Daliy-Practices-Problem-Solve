package Day11;

public class FrequencyCounter {

    // Function to count occurrences of a number in the array
    static int f(int number, int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};     // given array
        int[] queries = {1, 3, 4, 2, 10}; // queries

        // Process each query
        for (int q : queries) {
            System.out.println("Count of " + q + " = " + f(q, arr));
        }
    }
}

