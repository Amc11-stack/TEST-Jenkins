package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElement {

    public static Integer[] duplicateelement(int[] arr){

        HashSet<Integer> hs= new HashSet<>();

        ArrayList<Integer> li= new ArrayList<>();


        for(int b:arr){

           if(!hs.contains(b)){
               hs.add(b);
           }
           else {
               li.add(b);
           }

        }

       return  li.toArray(new Integer[0]);
    }

    public static void main(String[] args) {

        int[] aa= {1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 3};

        System.out.println(Arrays.toString(duplicateelement(aa)));

    }
}
