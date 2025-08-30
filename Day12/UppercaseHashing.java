package Day12;

public class UppercaseHashing {

    public static void main(String[] args) {
        String s = "ABCAABZ";
        int[] hash = new int[26]; // only uppercase letters

        // Step 1: Pre-storing
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'A']++;
        }

        // Step 2: Queries
        char[] queries = {'A', 'B', 'Z'};
        for (char q : queries) {
            System.out.println("Count of '" + q + "' = " + hash[q - 'A']);
        }
    }
}
