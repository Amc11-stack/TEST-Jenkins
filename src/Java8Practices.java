import java.util.*;
import java.util.stream.Collectors;

public class Java8Practices {

    public static void main(String[] args) {

        Map<String,Integer> hm= new HashMap<>();

        hm.put("AMan",26);
        hm.put("Rakhi",15);
        hm.put("arnav",67);
        hm.put("Rinku",23);

        hm.keySet().stream().forEach(System.out::println);

     Map<String,Integer> hmt=   hm.entrySet().stream().filter(Entry-> Entry.getValue()>20).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(hmt);

        //sort by value:

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue((e1,e2)-> e1-e2)).forEach(Entry-> System.out.println(Entry.getKey()+":"+Entry.getValue()));

         //without java8

        ArrayList<Map.Entry<String,Integer>> ar= new ArrayList(hm.entrySet());

        Collections.sort(ar, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

       for (Map.Entry<String,Integer> er:ar){

           System.out.println(er.getKey()+":"+er.getValue());
       }


    }
}
