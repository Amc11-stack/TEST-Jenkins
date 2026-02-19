package Array;

import java.util.Scanner;

public class Testall {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;  // Starting from the first prime number

        System.out.println("First 10 prime numbers:");

        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
