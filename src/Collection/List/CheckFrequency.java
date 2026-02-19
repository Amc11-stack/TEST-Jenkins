package Collection.List;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CheckFrequency {


    public static void main(String[] args) {


        String s = "AmanKumarKK";

        char[] ch = s.toCharArray();

        LinkedHashMap<Character,Integer> lm= new LinkedHashMap<>();

        for (char cc : ch) {
             if(!lm.containsKey(cc)){

                 lm.put(cc,1);
             }
             else{
                 lm.put(cc,lm.get(cc)+1);
             }

        }

       Set<Map.Entry<Character,Integer>> ss= lm.entrySet();

        for(Map.Entry<Character,Integer> mm:ss){

            int value=mm.getValue();

            if(mm.getValue()>1)
            {
                System.out.println(mm.getValue()+".."+mm.getKey());

            }
        }
    }

}
