package Array;

public class Array_Check {

    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 9, 4, 9, 7, 8, 7};

        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        System.out.println(max);


        // 1st pass: Find max
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // 2nd pass: Find 2nd max which is less than max
        for (int num : arr) {
            if (num > secondMax &&secondMax >thirdMax && num < max ) {
                thirdMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second max found");
        } else {
            System.out.println("Second Max: " + thirdMax);
        }


    }
}
