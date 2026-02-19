package String_Programme;

public class StringRepeat {

    public static void main(String[] args) {
        String a = "a3b3c3";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            if (Character.isLetter(currentChar)) {
                result.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                int count = Character.getNumericValue(currentChar);
                if (i > 0 && Character.isLetter(a.charAt(i - 1))) {
                    char prevChar = a.charAt(i - 1);
                    for (int j = 1; j < count; j++) {
                        result.append(prevChar);
                    }
                }
            }
        }
        System.out.println(result.toString());
    }
}

