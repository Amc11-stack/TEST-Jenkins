package frequency;

import java.util.*;

public class printNthhighestrfrequentelement {

    public static void checkfrequent(int[] arr,int num) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int a : arr) {

            if (hm.containsKey(a)) {

                hm.put(a, hm.get(a) + 1);
            } else {


                hm.put(a, 1);
            }
        }

        TreeMap<Object, List<Integer>> mm= new TreeMap<Object, List<Integer>>(Collections.reverseOrder());

        for(Map.Entry<Integer,Integer> ee:hm.entrySet())
        {

            int freq=ee.getValue();
            int elemnt= ee.getKey();

            if(!mm.containsKey(freq)){

                mm.put(freq,new ArrayList<>());
            }

            mm.get(freq).add(elemnt);
        }

           int count =0;

             for(Map.Entry<Object, List<Integer>> me:mm.entrySet())
             {
                 count++;

                 if(count==num)
                 {

                     System.out.println(me.getKey()+":"+me.getValue());
                     break;
                 }


             }
        {


        }
    }

    public static void main(String[] args) {

        int[] arr= {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};

        checkfrequent(arr,4);

    }
}
