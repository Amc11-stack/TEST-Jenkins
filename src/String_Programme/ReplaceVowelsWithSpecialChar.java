package String_Programme;

import java.util.*;

public class ReplaceVowelsWithSpecialChar {

    public static void main(String[] args) {
        String s = "AMVDEVNOYUYHJDV";

        // List of special characters
        List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')');
        Random random = new Random();

        // Set of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        // Use StringBuilder for mutable string manipulation
        StringBuilder result = new StringBuilder(s);

        // Replace each vowel with a random special character
        for (int i = 0; i < result.length(); i++) {
            if (vowels.contains(result.charAt(i))) {
                char randomSpecialChar = specialChars.get(random.nextInt(specialChars.size()));
                result.setCharAt(i, randomSpecialChar);
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("Modified String: " + result.toString());
    }
}
