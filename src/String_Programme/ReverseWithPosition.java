package String_Programme;

import java.util.Arrays;

public class ReverseWithPosition {

    public static void main(String[] args) {
        String input = "Aman is abad Boy";
        String result = reversePreservingSpaces(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public static String reversePreservingSpaces(String str) {
        // Convert the input string into a character array
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        // Use StringBuilder to collect non-space characters
        StringBuilder letters = new StringBuilder();

        // Collect all non-space characters
        for (char c : charArray) {
            if (c != ' ') {
                letters.append(c);
            }
        }

        // Reverse the collected non-space characters
        letters.reverse();

        // Replace non-space characters in the original positions
        int letterIndex = 0;
        for (int i = 0; i < n; i++) {
            if (charArray[i] != ' ') {
                charArray[i] = letters.charAt(letterIndex);
                letterIndex++;
            }
        }

        // Return the result as a string
        return new String(charArray);
    }


}
