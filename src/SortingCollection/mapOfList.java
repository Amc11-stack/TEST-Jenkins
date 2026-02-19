package SortingCollection;

import java.util.*;

public class mapOfList {

    public static void main(String[] args) {

        Map<String, List<String>> courses = new HashMap<>();
        courses.put("Math", Arrays.asList("Amit", "Rita"));
        courses.put("Physics", Arrays.asList("Amit"));
        courses.put("Chemistry", Arrays.asList("Rita", "Sita", "Mohan"));


             List<Map.Entry<String,List<String>>> lm=new ArrayList<>(courses.entrySet());

             Collections.sort(lm,(e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size()));

        System.out.println(lm);

    }
}
