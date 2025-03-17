package String_Programme;

import java.util.LinkedHashMap;

public class LongestSubstring_NONRepeatating {

    public static void main(String[] args) {

        String ss="Aman Choudhury gone";

        String longSubstring="";

        int longsubstringlength = 0;

        LinkedHashMap<Character,Integer> harmap= new LinkedHashMap<>();

        char[] a=  ss.replace(" ","").toCharArray();

        for(int i=0;i<=a.length-1;i++)
        {
            char cc= a[i];
            if(!harmap.containsKey(cc)){

                harmap.put(cc,i);
            }
            else{
               i= harmap.get(cc);
               harmap.clear();
            }
        }

        if(harmap.size()>longsubstringlength){

            longsubstringlength=harmap.size();

            longSubstring= harmap.keySet().toString();
        }

        System.out.println(longSubstring);
    }
}
