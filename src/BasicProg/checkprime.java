package BasicProg;

import java.util.Scanner;

public class checkprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many prime numbers you want: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2; // First prime number

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
                num++;
            }

        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
