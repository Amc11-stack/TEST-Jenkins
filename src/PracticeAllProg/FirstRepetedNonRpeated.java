package PracticeAllProg;

import java.util.*;

public class FirstRepetedNonRpeated {

    public static void main(String[] args) {

        int[] a = {9, 4, 9, 6, 7, 4};

        System.out.println(Arrays.toString(a));

        HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();

        for (int arr : a) {


            if (!hm.containsKey(arr)) {

                hm.put(arr, 1);
            } else {

                hm.put(arr, hm.get(arr) + 1);
            }

        }


        int firstrepeated = 0;

        int FirstrNoNrepeted = 0;

        for (Map.Entry<Integer, Integer> ee : hm.entrySet()) {

            if (ee.getValue() > 1 && firstrepeated==0) {

                firstrepeated=(int)ee.getKey();
                System.out.println(firstrepeated);


            } else if (ee.getValue() == 1 && FirstrNoNrepeted==0) {

               FirstrNoNrepeted=(int)ee.getKey();
                System.out.println(FirstrNoNrepeted);

            }

            if(firstrepeated!=0 && FirstrNoNrepeted!=0){

                break;
            }

        }


    }

}
