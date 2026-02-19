package String_Programme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Occurence_Char {

    public static void checkDuplicate(String st){

        char[] a= st.replaceAll("\\s+","").toCharArray();

        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0; i<a.length-1;i++)
        {
            if(!hm.containsKey(a[i])){

                hm.put(a[i],1);
            }
            else{

                hm.put(a[i],hm.get(a[i])+1);
            }

        }

          Set<Map.Entry<Character,Integer>> sf= hm.entrySet();

              for(Map.Entry<Character,Integer> ee:sf){

                  System.out.println(ee.getKey()+"-"+ee.getValue());
              }

      //Set std=  hm.keySet();






    }

    public static void main(String[] args) {

        String ss= "Java Concept Of The Day";

          checkDuplicate(ss);

    }
}
