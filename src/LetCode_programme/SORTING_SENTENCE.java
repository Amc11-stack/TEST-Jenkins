package LetCode_programme;

public class SORTING_SENTENCE {

    public static String teststring(String s) {

        String[] ss = s.split(" ");

        String[] strwords = new String[ss.length];

        for (String word : ss) {

            int a = Character.getNumericValue(word.charAt(word.length() - 1));

            strwords[a - 1] = word.substring(0, word.length() - 1);

        }

        return String.join(" ", strwords);
    }

    public static void main(String[] args) {

        String s ="is2 sentence4 This1 a3";

        System.out.println(teststring(s));

    }
}
