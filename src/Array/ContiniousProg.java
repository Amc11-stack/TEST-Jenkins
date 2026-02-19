package Array;

public class ContiniousProg {

    public static void main(String[] args) {


        int[] a = {12, 2, 3, 4, 5, 9, 10, 7, 8, 9, 10, 11};

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;  // reset
            }
        }

        System.out.println("Longest increasing subarray length: " + maxLen);


    }
}
