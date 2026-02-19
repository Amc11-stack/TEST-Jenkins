package Array;

import java.util.*;

public class RemoveDuplicateFromarray {

    public static void main(String[] args) {

//        int[] a={12,10,3,4};
//
//
//        List ll=Arrays.asList(a);
//        Set<int[]> ss= new HashSet<>(ll);
//        System.out.println(ss);

        int[] arr = {1, 2, 3, 2, 4, 1,6, 5};
        int[] temp = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

// print unique elements
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }






    }



}
