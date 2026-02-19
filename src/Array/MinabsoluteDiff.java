package Array;

import java.util.Arrays;

public class MinabsoluteDiff {

    public static void main(String[] args) {

        int[] arr= {3, 8, 15, 17, 9};

        int minDiff=Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               int diff = Math.abs(arr[i] - arr[j]);
//                minDiff = Math.min(minDiff, diff);
                if(diff<minDiff){
                    minDiff=diff;
                }
            }
        }



        Arrays.sort(arr);
        int maxdiff= arr[arr.length-1]-arr[0];

        System.out.println(minDiff);
        System.out.println(maxdiff);
    }


}
