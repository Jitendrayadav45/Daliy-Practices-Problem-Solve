package Day12;

public class LowercaseHashing {

    public static void main(String[] args) {
        String s = "abcdabefc";
        int[] hash = new int[26]; // only lowercase letters

        // Step 1: Pre-storing frequencies
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Step 2: Queries
        char[] queries = {'a', 'c', 'z'};
        for (char q : queries) {
            System.out.println("Count of '" + q + "' = " + hash[q - 'a']);
        }
    }
}

