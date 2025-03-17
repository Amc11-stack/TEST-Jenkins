package Array;

import java.util.Arrays;
import java.util.HashMap;

public class SubArray {

    public static void printAllSubarraysWithGivenSum(int[] inputArray, int givenSum) {
        for (int i = 0; i < inputArray.length; i++) {
            int currentSum = 0;
            for (int j = i; j < inputArray.length; j++) {
                currentSum += inputArray[j];
                if (currentSum == givenSum) {
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(" " + inputArray[k]);
                    }
                    System.out.println(" ]");
                }
            }
        }
    }

    public static void main(String[] args) {
        printAllSubarraysWithGivenSum(new int[] {2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);

        System.out.println("=====================================");

        printAllSubarraysWithGivenSum(new int[] {5, -9, 4, -2, 7, 1, -4, -3, -7}, -7);

        System.out.println("=====================================");

        printAllSubarraysWithGivenSum(new int[] {7, 3, 6, 5, 21, -6, -15, 28, 8}, 21);
    }

}
