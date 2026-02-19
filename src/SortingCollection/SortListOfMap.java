package SortingCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortListOfMap {

    public static void main(String[] args) {

        List<Map<String, Integer>> list = Arrays.asList(
                Map.of("Zebra", 10),
                Map.of("Apple", 20),
                Map.of("Mango", 5)
        );


        //Collections.sort(list,(e1,e2)-> Integer.compare(e2.values().iterator().next(),e1.values().iterator().next()));

       List<Map.Entry<String,Integer>> ll= list.stream().flatMap(a->a.entrySet().stream()).sorted((e1,e2)-> e1.getKey().compareToIgnoreCase(e2.getKey())).collect(Collectors.toList());

        System.out.println(ll);


    }
}
