package Collection._MAP;

import java.util.*;

public class HASHMAP_TEST {



    public static void main(String[] args) {

        HashMap<String,Integer> hs= new HashMap<>();

        hs.put("AMan",112);
        hs.put("SHIVIKA",13);
        hs.put("LAASYA",45);
        hs.put("JOHN",112);
        hs.put("AMan",67);

        hs.putIfAbsent("Raj",34);

        System.out.println(hs);

        //Ascending order
        TreeSet<Object> tr= new TreeSet<>(hs.values());

        Set ss=hs.keySet();

        List<Map.Entry<String,Integer>> li= new ArrayList<>(hs.entrySet());

       Iterator<Object> it=ss.iterator();

       while(it.hasNext()){

            Object oo=it.next();
           // li.add(hs.get(oo));
       }



//       Collections.sort(li,Collections.reverseOrder());


       System.out.println(li);

       Collections.sort(li, new Comparator<Map.Entry<String,Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }

       });

      // li.sort(Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : li) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
