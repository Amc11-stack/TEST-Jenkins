package Array;

import java.util.Arrays;

public class Remove_Array_Element {
    public static void main(String[] args) {
        int[] arr={12,30,40, 50};

//        for(int i=2;i<arr.length-1;i++)
//        {
//            arr[i]=arr[i+1];
//
//
//        }
//
//        System.out.println(Arrays.toString(arr));

        //
        int[] arj=Arrays.stream(arr).filter(x->x!=40).toArray();
        System.out.println( Arrays.toString(arj));
    }



}
