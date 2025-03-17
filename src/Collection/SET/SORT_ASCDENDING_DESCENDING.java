package Collection.SET;



import java.util.*;

public class SORT_ASCDENDING_DESCENDING{

    public static void main(String[] args) {

        Set<String> ss= new HashSet<>();

        ss.add("aman");
        ss.add("Test");
        ss.add("FORCE");
        ss.add("Shivika");

        List<String> li= new ArrayList<>(ss);

        Collections.sort(li,Collections.reverseOrder());

        li.sort((o1, o2) -> o1.compareTo(o2));

       // Collections.sort(li, new Test());

        System.out.println(li);

    }
}
