package frequency;

import java.util.*;

public class sortByfrequenctInAscendingorder {

    public static void sortByFrequency(int[] arr)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();

        for (int a:arr) {

            if (hm.containsKey(a)) {

                hm.put(a, hm.get(a) + 1);
            } else {


                hm.put(a, 1);
            }

        }

        ArrayList<Map.Entry<Integer,Integer>> li= new ArrayList(hm.entrySet());

        Collections.sort(li, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//            }

            //sort by key

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getKey()-o1.getKey();
            }
        });

        for(Map.Entry<Integer,Integer> mm:li)
        {
            System.out.println(mm.getKey()+":"+mm.getValue());

        }

    }

    public static void main(String[] args) {

        int[] arr= {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};

        sortByFrequency(arr);
    }
}
