public class factorial {

    public static int factorialWithRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialWithRecursion(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        System.out.println(factorialWithRecursion(5));

    }
}
