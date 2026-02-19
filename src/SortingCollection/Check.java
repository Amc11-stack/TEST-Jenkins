package SortingCollection;

import java.util.*;

public class Check {

    public static void main(String[] args) {

        List<Integer> li= Arrays.asList(10,4,23,3);

        TreeSet<Integer> ts= new TreeSet<>(Collections.reverseOrder());

        ts.addAll(li);


        System.out.println(ts.higher(ts.first()));
        System.out.println(ts.lower(ts.last()));


    }
}
