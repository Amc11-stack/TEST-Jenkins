package PracticeAllProg;

public class LongestSubarray {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int maxlen = 0;
        int startindex = -1;
        int endindex = -1;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k && j - i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    startindex = i;
                    endindex = j;

                }

            }


        }



          for(int i=startindex;i<=endindex;i++)
          {
              System.out.println(arr[i]);
          }
    }
}
