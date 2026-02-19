package String_Programme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutrepitative {

    public static String longsubripit(String ss) {

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>(4);

        int longestsubstringlength = 0;
        String logfsubstring = null;

        char[] ch = ss.trim().toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (!hm.containsKey(ch[i])) {
                hm.put(ch[i], i);
            } else {

                i = hm.get(ch[i]);
                hm.clear();
            }

            if (hm.size() > longestsubstringlength) {
                longestsubstringlength = hm.size();

                logfsubstring = hm.keySet().toString();
            }

        }
        return  logfsubstring;
    }

    public static void main(String[] args) {

    String s="javaconceptofteday";

        System.out.println( longsubripit(s));

    }
}

