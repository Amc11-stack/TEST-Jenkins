package Array;

public class RemoveDuplicateArray {

    public static void main(String[] args) {

        int[] arr = {15, 21, 11, 21, 51, 21, 11};

        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if this element is already seen before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) continue;

            // Count occurrence
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If element occurs only once, print it
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
