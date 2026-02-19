package String_tricky_Prog;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

    String s="Listen, Silent";

       String[] words=s.trim().split(",");
       boolean anagramcheck=false;

       if(words[0].trim().length()!= words[1].trim().length()){

           System.out.println("not anagram");

       }
       else{

           String one= words[0].trim().toLowerCase();
           String two= words[1].trim().toLowerCase();
           char[] arr1 = one.toCharArray();
           char[] arr2 = two.toCharArray();


           Arrays.sort(arr1);
           Arrays.sort(arr2);

           anagramcheck=Arrays.equals(arr1,arr2);

           if ((anagramcheck)){

               System.out.println("two are angram");
           }


       }


    }
}
