package Array;

public class continiousArray {

    public static void main(String[] args) {

        int[] arr = {12, 2, 3, 45, 5, 3, 4, 5, 6};

        int maxLen = 1;
        int endIndex = 0;

        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1]==1) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    endIndex = i;
                }
            } else {
                currLen = 1;
            }
        }

        int start = endIndex - maxLen + 1;
        System.out.println("Longest increasing subarray:");
        for (int i = start; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
