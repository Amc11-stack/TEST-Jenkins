import java.util.*;

public class Remove_Duplicate_FROM_LIST {

    public static List<String> removeDuplicates(List<String> list) {
        Set<String> seen = new LinkedHashSet<>();
        seen.addAll(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        List<String> result = removeDuplicates(data);

        System.out.println("Original list: " + data);
        System.out.println("List after removing duplicates: " + result);
    }

}
