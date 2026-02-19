package String_Programme;

import java.util.HashSet;
import java.util.Set;

public class Permuttaion {

    public static void permutation(String ss,String target,Set<String> hs){

        if(ss==null||ss.isEmpty())
        {
            hs.add(target);
            return;
        }

        for(int i=0;i<ss.length();i++){
            char a=ss.charAt(i);
            String remaining= ss.substring(0,i)+ss.substring(i+1);
            permutation(remaining,target+a,hs);
        }

    }


    public static void main(String[] args) {

        String s="ABC";

        HashSet<String> hs= new HashSet<>();

        permutation(s,"",hs);

        hs.forEach(System.out::println);



    }
}
