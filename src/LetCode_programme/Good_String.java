package LetCode_programme;

import java.util.Stack;

public class Good_String {

    public static String returnGoodString(String Words) {

        char[] ch = Words.toCharArray();

        Stack<Character> newch = new Stack<>();

        StringBuilder ss = new StringBuilder();

        for (Character cc : ch) {

            if (newch.size() == 0) {
                newch.push(cc);
            } else {
                char top = newch.peek();
                if (Character.toUpperCase(cc) == Character.toUpperCase(top)) {

                    if (Character.isUpperCase(cc) && Character.isLowerCase(top) || Character.isLowerCase(cc) && Character.isUpperCase(top)) {

                        newch.pop();
                    } else {

                        newch.push(cc);
                    }

                } else {

                    newch.push(cc);
                }
            }


        }

        while (newch.size() != 0) {

            ss.append(newch.pop());
        }


        return ss.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(returnGoodString("leEeetcode"));
    }
}
