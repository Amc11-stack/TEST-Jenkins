package Array;

import java.util.HashSet;

public class DuplicateElement {

    public static void duplicateelement(int[] arr){

        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> dpElements = new HashSet<>();

        for(int b:arr){

            if(!hs.add(b)){

                dpElements.add(b);
            }

        }

        System.out.println(dpElements);
        System.out.println(hs);
    }

    public static void main(String[] args) {

        int[] aa= new int[]{1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 3};

        duplicateelement(aa);

    }
}
