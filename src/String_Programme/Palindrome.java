package String_Programme;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {

        String s = "rotator";

        int left = 0;
        int reight = s.length() - 1;
        boolean ststus = false;

        while(left<reight){

            if(s.charAt(left)==s.charAt(reight)){
                ststus=true;
                left++;
                reight--;
            }

        }

        if(ststus){
            System.out.println("pallindrome");
        }
    }
}
