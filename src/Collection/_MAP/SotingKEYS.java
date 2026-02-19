package Collection._MAP;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SotingKEYS {

    public static void main(String[] args) {

        Map<String,Integer> hm= new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(),o1.length());
            }
        });

        hm.put("Aman",32);
        hm.put("rahul",24);
        hm.put("ravi",16);
        hm.put("Sanket",45);

        System.out.println(hm.keySet().toString());
    }
}
