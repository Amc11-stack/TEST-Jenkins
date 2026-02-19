package Array;

import java.util.Arrays;

public class MoveElemnttoFirstEnd {

    public static void main(String[] args) {

        int[] a={12, 0, -7, 0, 8, 0, 3};

        int count=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                  a[count]=a[i];
                  count++;
            }
        }

        while(count<a.length)
        {
            a[count]=0;
            count++;
        }

        System.out.println(Arrays.toString(a));
    }
}
