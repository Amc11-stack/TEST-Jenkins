package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer  {

    public static void main(String[] args) {
        Consumer<Integer> con =     (t) ->  System.out.println(t);

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.stream().forEach(con);
        con.accept(10);

    }
}
