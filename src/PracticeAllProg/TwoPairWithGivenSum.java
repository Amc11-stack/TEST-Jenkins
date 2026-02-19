package PracticeAllProg;

import java.util.Arrays;

public class TwoPairWithGivenSum {


    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5};

        int target = 6;

        int left = 0;
        int right = arr.length - 1;

        Arrays.sort(arr);

        while (left < right) {

            if (arr[left] + arr[right] == target) {

                System.out.print("(" + arr[left] + "," + arr[right]);
                System.out.println(")");
                left++;
                right--;
            }

        }

    }
}
