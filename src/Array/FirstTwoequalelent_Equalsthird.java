package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstTwoequalelent_Equalsthird {


    public static void getArrayTriplets(int[] arr){

        Arrays.sort(arr);

        HashSet<Integer> elementSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
        {
            elementSet.add(arr[i]);
        }

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){

                if(elementSet.contains(arr[i]+arr[j])){

                    System.out.println("["+arr[i]+", "+arr[j]+", "+(arr[i]+arr[j])+"]");
                }
            }
        }


    }


    public static void main(String[] args) {

        getArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});

        System.out.println("===========================================");

        getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});

        System.out.println("===========================================");

        getArrayTriplets(new int[] {1, 3, 9, 2, 6, 4, 8, 5, 7});
    }
}
