package String_Programme;

public class a3b3c3 {

    public static void main(String[] args) {

        String s = "a3b3c3";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int count = Character.getNumericValue(c);
                char g = s.charAt(i-1);
                for (int j = 0; j < count+1; j++) {
                    sb.append(g);
                }
            }
        }

        System.out.println(sb);
    }
}
