package PracticeAllProg;

import java.util.Arrays;

public class SubArrayProig {

    public static void main(String[] args) {

        int[] arr= {10, 5, 2, 7, 1, 9};

        int k=15;

        int startindex=-1;
        int lastindex=-1;

        int maxlen=0;

        for(int i=0;i<arr.length-1;i++)
        {
            int sum=0;

            for (int j=i;j<arr.length;j++)
            {
               sum+=arr[j];


               if(sum==k && (j-i+1)>maxlen){

                   maxlen=j-i+1;
                   startindex=i;
                   lastindex=j;
               }

            }
        }

        for (int i=startindex;i<=lastindex;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
