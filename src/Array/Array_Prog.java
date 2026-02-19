package Array;

public class Array_Prog {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 3, 5, 1};
        int n = arr.length;

        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in unique[]
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not found, add it to unique[]
            if (!isDuplicate) {
                unique[uniqueCount++] = arr[i];
            }
        }

        // Print unique elements
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

    }
}
