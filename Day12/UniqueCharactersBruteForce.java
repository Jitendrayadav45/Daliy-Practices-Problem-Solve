package Day12;

public class UniqueCharactersBruteForce {
    public static void main(String[] args) {
        String s = "abccdefgfhi";
        String unique = "";  // unique characters store karne ke liye

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check karo kya unique string me already hai
            boolean alreadyPresent = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    alreadyPresent = true;
                    break;
                }
            }

            // agar nahi mila to add kar do
            if (!alreadyPresent) {
                unique += ch;
            }
        }

        System.out.println("Unique characters: " + unique);
        System.out.println("Count: " + unique.length());
    }
}

