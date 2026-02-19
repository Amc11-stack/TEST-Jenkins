import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwosortedlist {

        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

            list1.addAll(list2);             // Merge both
            Collections.sort(list1);         // Sort combined list

            System.out.println("Merged Sorted List: " + list1);
        }
}
