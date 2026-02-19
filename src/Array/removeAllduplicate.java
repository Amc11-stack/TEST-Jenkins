package Array;

public class removeAllduplicate {

    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 3, 4, 1, 7, 1, 2, 2};

        System.out.print("Only unique numbers: ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
