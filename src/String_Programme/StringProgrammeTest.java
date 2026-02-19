package String_Programme;

import java.util.*;

public class StringProgrammeTest {

    public static void main(String[] args) {

        String s = "JavaConceptOfTheDay";

        char[] a = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char cc : a) {
            if (!hm.containsKey(cc)) {
                hm.put(cc, 1);
            } else {
                hm.put(cc, hm.get(cc) + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> se = hm.entrySet();

        for (Map.Entry<Character, Integer> mm : se) {
            if (mm.getValue() == 1) {
                int max = mm.getValue();
                System.out.println("character not repeat is :" + mm.getKey()+":"+mm.getValue());
                break;
            }

        }
        for (Map.Entry<Character, Integer> mm : se) {
            if (mm.getValue() > 1) {
                int max = mm.getValue();
                System.out.println("character repeat is :" + mm.getKey()+":"+mm.getValue());
                break;
            }

        }








    }
}
