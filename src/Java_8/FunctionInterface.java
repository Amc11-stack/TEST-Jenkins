package Java_8;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {

        Function<String,Integer> fn= (input) -> input.length();
        Function<Integer,Integer> fn2= (input) -> input+20;

        System.out.println(fn.apply("aman"));
        System.out.println(fn2.compose(fn).apply("aman"));
        System.out.println(fn.andThen(fn2).apply("aman"));

    }
}
