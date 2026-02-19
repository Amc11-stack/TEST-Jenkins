package PracticeAllProg;

import java.util.Arrays;

public class movingAll0ToEnd {

    public static void main(String[] args) {

        int[] arr={1, 0, 2, 0, 4};

        int[]b= new int[arr.length];
        int count=arr.length-1;

        for(int i=arr.length-1;i>=0;i--)
        {
           if(arr[i]!=0)
           {
               b[count]=arr[i];
               count--;

           }
        }
        System.out.println(Arrays.toString(b));
       while(count>arr.length){

           b[count]=0;
           count--;
       }

        System.out.println(Arrays.toString(b));
    }
}
