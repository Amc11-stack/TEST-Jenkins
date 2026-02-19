public class primeNumberbetween1T100 {

    public static void main(String[] args) {
        int n = 10; // Example input
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
