package String_Programme;

import java.util.LinkedHashSet;

public class RemoveAdjecentChar {
    public static void main(String[] args) {

        String s = "aabaarbarccrabmq";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> lh = new LinkedHashSet<>();

        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                // Skip both duplicates
                i += 2;
            } else {
                char ch = s.charAt(i);
                if (!lh.contains(ch)) {
                    lh.add(ch);
                    result.append(ch);
                }
                i++;
            }
        }

        System.out.println(result.toString());  //

    }


}
