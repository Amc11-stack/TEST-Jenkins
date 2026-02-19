package String_Programme;

import java.util.Arrays;
import java.util.List;

public class RemoveVowel {

    public static String RemoveVowels(String ss){

        List<Character> ll= Arrays.asList('A','E','I','O','U');

        StringBuilder sd=new StringBuilder();
      char[] aa=  ss.toCharArray();

      for(int i=0;i<aa.length;i++){

          if(!ll.contains(aa[i])){
              sd.append(aa[i]);
          }
      }

      return sd.toString();


    }

    public static void main(String[] args) {

        String ss="Amaneoihgcrdd";

        System.out.println( RemoveVowels(ss.toUpperCase()));
    }
}
