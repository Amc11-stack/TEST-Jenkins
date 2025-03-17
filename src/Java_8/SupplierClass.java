package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SupplierClass {

    public static void main(String[] args) {


//        System.out.println(predicate.test("Sunmicro"));

        List<String> list= Arrays.asList("String","left","Aman","Sharma");
        System.out.println( list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList()));

     list.forEach(x-> System.out.println(x));

    }




}
