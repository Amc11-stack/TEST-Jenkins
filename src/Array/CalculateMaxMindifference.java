package Array;

import java.util.Arrays;

public class CalculateMaxMindifference {

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 12, 3};

        // Step 1: Sort the array
        Arrays.sort(arr);  // arr becomes [1, 3, 5, 9, 12]

        // Step 2: Min Difference (between adjacent elements)
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1]; // absolute not needed, array is sorted
            minDiff = Math.min(minDiff, diff);
        }

        // Step 3: Max Difference (between first and last elements in sorted array)
        int maxDiff = arr[arr.length - 1] - arr[0];

        System.out.println("Minimum Absolute Difference: " + minDiff);
        System.out.println("Maximum Absolute Difference: " + maxDiff);
    }
}
