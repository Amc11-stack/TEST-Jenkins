import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentelementInList {

        public static <T>Map.Entry<T, Integer> findMostFrequent(List<T> list) {
            if (list == null || list.isEmpty()) return null;

            Map<T, Integer> frequencyMap = new HashMap<>();
            for (T item : list) {
                frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
            }

            Map.Entry<T, Integer> mostFrequent = null;
            for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
                if (mostFrequent == null || entry.getValue() > mostFrequent.getValue()) {
                    mostFrequent = entry;
                }
            }

            return mostFrequent;
        }

        public static void main(String[] args) {
            List<String> data = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
            Map.Entry<String, Integer> result = findMostFrequent(data);

            if (result != null) {
                System.out.println("Most frequent element: " + result.getKey());
                System.out.println("Frequency: " + result.getValue());
            } else {
                System.out.println("List is empty or null.");
            }
        }
}
