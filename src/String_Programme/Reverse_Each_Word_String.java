package String_Programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reverse_Each_Word_String {

    public static void main(String[] args) {

        String str= "Java Concept Of The Day";

        String[] words= str.split(" ");

        StringBuilder ss= new StringBuilder();



        String s="";

        for(int i=0;i<words.length;i++)
        {
            String word=words[i];

            for(int j= word.length()-1;j>=0;j--){

                ss=ss.append(word.charAt(j));
            }
            s=ss+" ";
        }
System.out.println(s);

  s=  Arrays.stream(words).map(x->new StringBuilder(x).reverse().toString()).collect(Collectors.joining(" "));

        System.out.println(s);
    }
}
