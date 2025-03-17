package Java_8;

import java.util.function.UnaryOperator;

public class UnaryOperatorTesting {

    public static void main(String[] args) {

        UnaryOperator<String> str= (x) -> x+"Testing";

      String aa=  str.apply("Aman");



    }
}
