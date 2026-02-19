package String_Programme;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class LongestWithouitrepetating {

    public static void checkrepetating(String s) {

        LinkedHashMap<Character, Integer> lm = new LinkedHashMap<>();

        int substringlength = 0;
        String substring = "";

        char[] aa = s.toCharArray();

        for (int i = 0; i < aa.length; i++) {
            char c = aa[i];

            if (!lm.containsKey(c)) {
                lm.put(c, i);

            } else {

                i = lm.get(c);
                lm.clear();
            }

            if(lm.size()>substringlength)
            {
                substringlength=lm.size();

                substring=lm.keySet().toString();
            }

        }

        //System.out.println(Character.toString(substring));
        System.out.println( substring);


    }

    public static void main(String[] args) {

        checkrepetating("javaconceptoftheday");



    }
}
