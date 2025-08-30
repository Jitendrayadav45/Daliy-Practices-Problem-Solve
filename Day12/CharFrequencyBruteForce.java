package Day12;


public class CharFrequencyBruteForce {

    // Function to count occurrences of a character in a string
    static int f(char ch, String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abcdabefc";
        char[] queries = {'a', 'c', 'z'};

        // Process each query
        for (char q : queries) {
            System.out.println("Count of '" + q + "' = " + f(q, s));
        }
    }
}

