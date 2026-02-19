package BasicProg;

import java.util.Scanner;

public class BasicAverageNumbercalaculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to average: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        // Input numbers and compute sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        System.out.println("Average of the " + n + " numbers is: " + average);
    }
}
