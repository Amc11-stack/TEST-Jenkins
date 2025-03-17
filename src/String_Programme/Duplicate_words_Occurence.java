package String_Programme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_words_Occurence {

    public static void main(String[] args) {

        String s = "AMAN is a BAD BOY BUT AMAN Is TOO BAD";

        String[] words = s.split(" ");


//stream format
       Map<String,Long> wordsCount= Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


//        Map<String,Integer> wordsCount = new HashMap<String,Integer>();
//
//        for(String word:words){
//
//            if(!wordsCount.containsKey(word)){
//
//                wordsCount.put(word,1);
//            }
//
//            else {
//                wordsCount.put(word,wordsCount.get(word)+1);
//            }
//
//
//        }
//
       Set<String> ss= wordsCount.keySet();

        for(String Words:ss){

            if(wordsCount.get(Words)>1){
                System.out.println(Words + ":"+wordsCount.get(Words));
            }
            else{
                System.out.println(Words + ":"+1);
            }
            }
        }

    }



