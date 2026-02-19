package String_Programme;

public class Swap_Vowels {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  // make it case-insensitive
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "helloapple";
        char[] arr = s.toCharArray();

        // Step 1: Count vowels and store their positions in an array
        int[] vowelIndices = new int[arr.length];  // max possible size
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                vowelIndices[count++] = i;
            }
        }

        // Step 2: Swap adjacent vowels using the indices array
        for (int i = 0; i < count-1; i +=2) {
            int idx1 = vowelIndices[i];
            int idx2 = vowelIndices[i + 1];

            // Swap the vowels
            char temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }

        // Step 3: Print result
        System.out.println("Original: " + s);
        System.out.println("Modified: " + new String(arr));
    }



}
