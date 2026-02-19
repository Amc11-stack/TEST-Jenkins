package Collection._MAP;

import java.util.*;

public class sortedMap  {

    public static void main(String[] args) {

        Map<String,Integer> hm= new TreeMap<String,Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        hm.put("aman",123);
        hm.put("Rahul",78);
        hm.put("nadeem",900);
        hm.put("Jeeru",788);

        ArrayList<Map.Entry<String,Integer>> as= new ArrayList<>(hm.entrySet());

//        Collections.sort(as, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareToIgnoreCase(o2.getKey());
//            }
//        });
//
        for(Map.Entry<String,Integer> ee:as){

            System.out.println(ee.getKey()+":"+ee.getValue());
        }

        Collections.sort(as,Collections.reverseOrder());


    }
}
