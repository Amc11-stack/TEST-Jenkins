package Array;

public class printDuplicate {

    public static void main(String[] args) {

        int[] arr = {40, 2, 3, 40, 4, 1, 80, 3};
        int[] freq = new int[100];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
