package Java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sequentialstream {

    public static void main(String[] args) {

//        int[] a = {12, 23, 3, 34, 56, 55};
//
//        Stream.of(a).flatMapToInt(x-> Arrays.stream(x)).forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 3, 2, 6, 5, 8);
        stream.sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
}
