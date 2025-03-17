package String_Programme;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_chars {

    public static void main(String[] args) {

        String ss="aman";

       Map<Character,Long> charCount= ss.chars().mapToObj(x-> (char) x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
