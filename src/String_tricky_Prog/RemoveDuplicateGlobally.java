package String_tricky_Prog;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateGlobally {
    public static void main(String[] args) {

//        Input: "hello world hello"
//        Output: "helo wrd"

        String s= "hello world hello";


        String[] arr = s.split(" ");

        Set<Character> hs = new LinkedHashSet<>();

        StringBuilder sb = new StringBuilder();

        for (String words : arr) {

            char[] cc = words.toCharArray();
            LinkedHashMap<Character,Integer> lm= new LinkedHashMap<>();

            for (char c : cc) {

                if (!hs.contains(c) && !lm.containsKey(c)) {
                    lm.put(c,1);
                    hs.add(c);
                }
            }

            for (char cs : lm.keySet()) {

                sb.append(cs);
            }

            sb.append(" ");


        }

        System.out.println(sb.toString());


    }

}
