package String_tricky_Prog;

import java.util.*;




public class CheckWord {
    public static <Set> void main(String[] args) {


            String s = "do some homework";
            String[] words = s.split(" ");
            StringBuilder result = new StringBuilder();

           java.util.Set<Character> globalSet = new LinkedHashSet<Character>(); // tracks all characters seen globally


            for (String word : words) {
                Map<Character, Integer> map = new LinkedHashMap<>(); // unique per word

                for (char c : word.toCharArray()) {
                    // Only add if not already seen globally
                    if (!globalSet.contains(c) && !map.containsKey(c)) {
                        map.put(c, 1);
                        globalSet.add(c);
                    }
                }

                for (char ch : map.keySet()) {
                    result.append(ch);
                }

                result.append(" ");
            }

            System.out.println(result.toString().trim());
        }

    }
