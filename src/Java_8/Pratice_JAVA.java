package Java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pratice_JAVA {

    public static void main(String[] args) {

//      List<Integer> als =  Arrays.asList(12,3,4,99,33,6,12,4);
//
//        Map<Boolean, List<Integer>> separatedNumbers = als.stream().collect(Collectors.partitioningBy(x->x%2==0));
//
//        System.out.println(separatedNumbers);
//
//       List<Integer> even=separatedNumbers.get(true);
//       even.forEach(System.out::println);
//
//        List<Integer> odd=separatedNumbers.get(false);
//        odd.forEach(System.out::println);
//
//        //remove duplicate element:
//   System.out.println("-------------------");
//       als.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

       //frequency of each character:
        String s1="AMANA";

      Map<Character,Long> ch=s1.chars().mapToObj(x-> (char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

         System.out.println(ch);

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

       decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
