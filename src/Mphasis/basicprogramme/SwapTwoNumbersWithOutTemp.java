public class SwapTwoNumbersWithOutTemp {


    public static void main(String[] args) {
        int x = 10, y = 6;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x + ", y = " + y);
    }
}
