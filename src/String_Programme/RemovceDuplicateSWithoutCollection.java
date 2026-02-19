package String_Programme;

public class RemovceDuplicateSWithoutCollection {

    public static String removeDuplicates(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isDuplicate = false;

            // Check if currentChar already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, append to result
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("After removing duplicates: " + result);
    }
}
