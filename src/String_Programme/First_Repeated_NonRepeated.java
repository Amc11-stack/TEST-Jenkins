package String_Programme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class First_Repeated_NonRepeated {

    public static void main(String[] args) {

        String ss= "Aman kumar Choudhury Haider";

       char[] ch= ss.replace(" ","").toCharArray();

       ArrayList<Character> repeated = new ArrayList<>();

       ArrayList<Character> Nonrepeated = new ArrayList<>();


        Map<Character,Integer> cm= new HashMap<>();

        for(Character cc:ch){

            if(!cm.containsKey(cc)){

                cm.put(cc,1);
            }
            else{

                cm.put(cc,cm.get(cc)+1);
            }
        }

      Iterator<Character> it= cm.keySet().iterator();

        for(Character cg:ch){

            if(cm.get(cg)>1){
                repeated.add(cg);
            }

            Nonrepeated.add(cg);
        }


        System.out.println(repeated);
    }
}
