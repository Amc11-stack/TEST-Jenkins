package String_tricky_Prog;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Characters_from_Each_Word {

    public static void main(String[] args) {

//        Input: "programming is fun"
//        Output: "progamin is fun"

//        String s = "programming isss fufn";
        String s= "hello world hello";

        String[] arr = s.split(" ");

        Set<Character> hs = new LinkedHashSet<>();

        StringBuilder sb = new StringBuilder();

        for (String words : arr) {

            char[] cc = words.toCharArray();

            for (char c : cc) {

                if (!hs.contains(c)) {
                    hs.add(c);
                }
            }

            for (char cs : hs) {

                sb.append(cs);
            }
            hs.clear();

            sb.append(" ");


        }

        System.out.println(sb.toString());

    }


}
