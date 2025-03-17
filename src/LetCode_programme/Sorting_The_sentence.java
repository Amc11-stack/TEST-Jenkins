package LetCode_programme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting_The_sentence {

    public static  String SortingSentenceWithArray(String Sentences){

       String[] words= Sentences.split(" ");

       String[] addstring= new String[words.length];

       for(String word: words){
         int index=  Character.getNumericValue(word.charAt(word.length()-1));
         addstring[index-1]= word.substring(0,word.length()-1);
       }

    return String.join(" ",addstring);
    }

    public static String sortingthesentenceusinglist(String Sentences){

      String[] words=  Sentences.split(" ");

        List ls= new ArrayList<>(List.of(words));

        for(String word : words){

          int index= Character.getNumericValue( word.charAt(word.length()-1));

          ls.set(index-1,word.substring(0,word.length()-1));
        }

        return String.join(" ",ls);
    }

    public static void main(String[] args) {

        String text= "is2 sentence4 This1 a3";

       System.out.println(SortingSentenceWithArray(text));

        System.out.println(sortingthesentenceusinglist(text));

    }
}
