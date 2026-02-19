package PracticeAllProg;

import java.util.Arrays;

public class Bubbleshort {

    public static void main(String[] args) {

        int[] a={4,12,7,9,3,234};

        for(int i=0;i<a.length-i-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
