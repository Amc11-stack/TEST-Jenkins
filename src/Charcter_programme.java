import java.util.Arrays;

import java.lang.*;

public class Charcter_programme {

    public static int[] sortarray(int[] arr){

        System.out.println(Arrays.toString(arr));

        int zeroscount=0;
        int onescount=0;
        int twoscount=0;

        for (int i=0;i<arr.length-1;i++)
        {

            if(arr[i]==0)
            {
                zeroscount++;
            }

            if(arr[i]==1)
            {
                onescount++;
            }
            if(arr[i]==2)
            {
                twoscount++;
            }

        }

        for(int i=0;i<zeroscount;i++)
        {
            arr[i]=0;
        }

        for(int i=zeroscount;i<(zeroscount+onescount);i++)
        {
            arr[i]=1;
        }

        for(int i=(zeroscount+onescount);i<arr.length;i++)
        {
            arr[i]=2;
        }

        return arr;

    }

    public static void main(String[] args){

        int[] a= {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0};

        int[] b= sortarray(a);

        System.out.println(Arrays.toString(b));

    }
    }
