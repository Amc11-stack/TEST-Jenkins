package Array;

import java.util.Arrays;

public class Arrange012 {

    public static void main(String[] args) {

        int[] arr = {0,2,1,2,0,1,0};

        int left = 0;
        int right = arr.length - 1;
        int i = 0;

        while (i <= right) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                i++;
            }
            else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
            }
            else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
