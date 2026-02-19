package Array;

import java.util.Arrays;

public class SortanArrayAscendingDescending {

    public static void main(String[] args) {

        //sorted arrays in ascending ordr

        int[] a={3,34,5,1,90};

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
