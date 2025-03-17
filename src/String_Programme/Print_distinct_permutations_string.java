package String_Programme;

import java.util.HashSet;
import java.util.Set;

public class Print_distinct_permutations_string {

    public static void main(String[] args) {
        String str = "aab";
        Set<String> permutations = findPermutations(str);
        System.out.println(permutations);
    }

    public static Set<String> findPermutations(String str) {
        Set<String> result = new HashSet<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }

        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        Set<String> words = findPermutations(remainingStr);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newWord = word.substring(0, i) + firstChar + word.substring(i);
                result.add(newWord);
            }
        }

        return result;
    }
}
