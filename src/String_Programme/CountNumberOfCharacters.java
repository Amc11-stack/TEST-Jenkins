package String_Programme;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfCharacters {

    public static void main(String[] args) {
        String ss = "abbcccaacll";

        LinkedHashMap<Character, Integer> lm = new LinkedHashMap<>();

        char[] ch = ss.toCharArray();

        for (char a : ch) {

            if (!lm.containsKey(a)) {

                lm.put(a, 1);
            } else {

                lm.put(a, (lm.get(a) + 1));
            }
        }



        String newstring = "";

        for (Map.Entry<Character,Integer> ee:lm.entrySet()){

            System.out.println(ee.getKey()+":"+ee.getValue());
            newstring+=ee.getKey().toString()+ee.getValue().toString()+"";
        }

        System.out.println(newstring);
    }
}
