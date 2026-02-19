package SortingCollection;

import java.util.*;

public class MapSorting {

    public static void main(String[] args) {

        Map<String,Integer> mp= new HashMap<>();

        mp.put("Aman",26);
        mp.put("rahu",30);
        mp.put("Jyotirmaye",45);

          List<Integer> value= new ArrayList<>(mp.values());

        System.out.println(value);


        System.out.println(mp.entrySet().toString()+"-");




        List<Map.Entry<String,Integer>> li= new ArrayList<>(mp.entrySet());

//        Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                   return Integer.compare(o2.getValue(),o1.getValue());
//            }
//        });

        //Collections.sort(li,(e1,e2)-> e2.getValue()-e1.getValue());

        Collections.sort(li,(e1,e2)-> e2.getKey().length()-e1.getKey().length());

        li.stream().forEach(System.out::println);




    }
}
