package Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Java8 {

    public static void main(String[] args) {

        List<String> ls= new ArrayList<>();

        ls.add("aman");
        ls.add("Arab");
        ls.add("maany");
        ls.add("arman");

        ls.stream().filter((a)->a.toLowerCase().startsWith("a")).forEach(System.out::println);

        //Arrays.stream(ls.get(0).toCharArray());

      LinkedHashMap<Character,Long> lm=  ls.get(0).chars() // IntStream
              .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));



        Optional<Character> op=  lm.entrySet().stream().filter(entry-> entry.getValue()==1).map(Map.Entry::getKey).findFirst();

        System.out.println(op.get());
    }
}
