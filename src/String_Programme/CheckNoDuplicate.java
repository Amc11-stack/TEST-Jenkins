package String_Programme;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckNoDuplicate {

    public static String removeDuplicates(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();
        for (String word : words) {
             // preserves order
            for (char ch : word.toCharArray()) {
                if (!seen.contains(ch)) {
                    result.append(ch); // Add to the final text
                    seen.add(ch);      // Mark as seen so we don't add it again
                }; // duplicates automatically ignored
            }

//            for (char ch : seen) {
//                result.append(ch);
//            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "do some homework";
        String output = removeDuplicates(input);
        System.out.println(output); // Output: do sme hwrk
    }


}
