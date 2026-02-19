package String_Programme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringrepetative {

    public static void main(String[] args) {
        String input = "jaavaravasghchg";
        String longestSubstring = findLongestDuplicateSubstring(input);

        if (longestSubstring.isEmpty()) {
            System.out.println("No duplicate substrings found.");
        } else {
            System.out.println("The longest duplicate substring is: " + longestSubstring);
        }
    }

    public static String findLongestDuplicateSubstring(String s) {
        int n = s.length();
        String longest = "";

        // Using a HashSet to track substrings
        HashSet<String> seen = new HashSet<>();

        // Check all substrings of different lengths
        for (int length = 1; length < n; length++) {
            for (int i = 0; i <= n - length; i++) {
                String substring = s.substring(i, i + length);
                if (seen.contains(substring) && substring.length() > longest.length()) {
                    longest = substring;
                } else {
                    seen.add(substring);
                }
            }
        }

        return longest;
    }


}
