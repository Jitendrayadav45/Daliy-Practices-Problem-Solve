package Day11;

public class HashingExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};          // Given array
        int[] queries = {1, 3, 4, 2, 10};     // Queries

        /// Assumption: max element <= 12
        int maxElement = 12;
        int[] hash = new int[maxElement + 1]; // hash array of size 13

        // Step 1: Pre-storing frequencies
        for (int num : arr) {
            hash[num]++; // increase frequency
        }

        // Step 2: Fetching answers for queries
        for (int q : queries) {
            System.out.println("Count of " + q + " = " + hash[q]);
        }
    }
}

