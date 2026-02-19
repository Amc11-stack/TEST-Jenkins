package Java_8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOcuuringOfCharacter {

    public static void main(String[] args) {

        String ss="AManKumar";

       ss.chars().mapToObj((c)->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
               entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
