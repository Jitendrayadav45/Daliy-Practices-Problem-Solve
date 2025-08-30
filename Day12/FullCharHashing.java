package Day12;

public class FullCharHashing {

    public static void main(String[] args) {
        String s = "aAbBcCzZ123";
        int[] hash = new int[256]; // supports all ASCII characters

        // Step 1: Pre-storing
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        // Step 2: Queries
        char[] queries = {'a', 'A', 'z', '1', 'x'};
        for (char q : queries) {
            System.out.println("Count of '" + q + "' = " + hash[q]);
        }
    }
}

