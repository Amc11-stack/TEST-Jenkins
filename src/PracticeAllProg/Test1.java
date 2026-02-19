package PracticeAllProg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        String ss = "Aman kumar".toLowerCase();

        String ns = "";

        String[] words = ss.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            LinkedHashMap<Character, Integer> lm = new LinkedHashMap<>();
            StringBuilder sb = new StringBuilder();

            String word = words[i];
            char[] cc = word.toCharArray();

            for (char r : cc) {
                lm.put(r, lm.getOrDefault(r, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : lm.entrySet()) {
                if (entry.getValue() == 1) {
                    sb.append(entry.getKey());
                }
            }

            ns += sb.toString() + " ";
        }

        System.out.println(ns.trim());
    }
}





































