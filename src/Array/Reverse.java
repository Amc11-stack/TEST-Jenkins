package Array;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] a={12,4,5,6,9};

        int left=0;
        int right= a.length-1;




            while(left<right)
            {
               int temp=a[left];
               a[left]=a[right];
               a[right]=temp;
               left++;
               right--;

            }

        System.out.println(Arrays.toString(a));
    }
}
