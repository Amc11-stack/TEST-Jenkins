package Array;

import java.util.*;

public class Union {

    static void union(int[] ... inputArrays)
    {
        Set<Integer> unionSet = new HashSet<>();

        System.out.println("Input Arrays :");

        System.out.println("======================");

        for (int[] inputArray : inputArrays)
        {
            System.out.println(Arrays.toString(inputArray));

            for (int i : inputArray)
            {
                unionSet.add(i);
            }
        }

        System.out.println("===========================");

        System.out.println("Union Of All Input Arrays :");

        System.out.println("===========================");

        System.out.println(unionSet);
    }

    public static void intercestionarray(Integer[] ...arrays){

        HashSet<Object> hss= new HashSet<>(Arrays.asList(arrays[0]));





            for(int i=1;i< arrays.length;i++){

                HashSet<Object>      nh   = new HashSet<>(Arrays.asList(arrays[i]));
                hss.retainAll(nh);
            }


        System.out.println(hss);
    }
    public static void main(String[] args) {

        Integer[] inputArray1 = {2, 3, 4, 7, 1};

        Integer[] inputArray2 = {4, 1, 3, 5};

        Integer[] inputArray3 = {8, 4, 6, 2, 1};

        Integer[] inputArray4 = {7, 9, 4, 1};

         //union(inputArray1, inputArray2, inputArray3, inputArray4);

        System.out.println("intersection array...........");

         intercestionarray(inputArray1, inputArray2, inputArray3, inputArray4);

    }


}
