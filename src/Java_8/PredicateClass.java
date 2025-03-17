package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {

        Predicate<String> predicate = (t) -> t.startsWith("S");
//        System.out.println(predicate.test("Sunmicro"));

        List<String> list= Arrays.asList("String","left","Aman","Sharma");

        list.stream().filter((t) -> t.startsWith("S")).forEach(t-> System.out.println(t));

    }




}
