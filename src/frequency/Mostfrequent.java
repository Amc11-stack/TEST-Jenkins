package frequency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mostfrequent {

    public static void checkfrequent(int[] arr)
    {

        HashMap<Integer,Integer> hm= new HashMap<>();

        for (int a:arr) {

            if (hm.containsKey(a)) {

                hm.put(a, hm.get(a) + 1);
            } else {


            hm.put(a, 1);
        }
        }
       Set<Map.Entry<Integer,Integer>> mp =  hm.entrySet();

        int max=1;

//      int main=  Collections.min(hm.values());
//
//        int max=1;
        int key = 0;

        for(Map.Entry<Integer,Integer> ee:mp){

            if(ee.getValue()>max)
            {
                max=ee.getValue();
                key=ee.getKey();
            }
            
        }
        System.out.println(key+":"+max);
    }

    public static void main(String[] args) {
   int[] arr= {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};

//     int frequentElemnt= checkfrequent(arr);

       checkfrequent(arr);

    }
}
