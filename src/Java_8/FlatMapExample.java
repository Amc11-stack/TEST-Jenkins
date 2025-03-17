package Java_8;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

//        int[] a={1,3,5,6,7,89};
//
//        Stream.of(a).flatMapToInt(x->Arrays.stream(x)).forEach(System.out::println);


//        List<Institute> instituteList = new ArrayList<>();
//
//        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
//        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
//        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
//
//            //print cities
//            instituteList.stream().flatMap(institute ->institute.getCities().stream()).forEach(System.out::println);
//           instituteList.stream().map(Institute::getCollegeName).forEach(System.out::print);

//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8)
//        );
//
//       int s= listOfLists.stream().flatMap(x->x.stream() ).mapToInt(Integer::intValue).sum();

       // System.out.println(s);

        int[][] arr= new int[][]{{1,3},{4,5},{6,7},{8,9}};

       int j= Arrays.stream(arr).flatMapToInt(x-> Arrays.stream(x)).sum();
        System.out.println(j);





    }
}
