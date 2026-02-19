package Array;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String s = "amankumar";

        int[] freq = new int[256]; // Step 1: Frequency array (for all ASCII chars)

        // Step 2: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        System.out.print("Duplicate characters: ");

        // Step 3: Print characters that occurred more than once
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > 1) {
                System.out.print(s.charAt(i) + " ");
                freq[s.charAt(i)] = 0; // Avoid printing again
            }
        }
    }
}
