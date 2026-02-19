package frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leastfrequency {

    public static void findLeastFrequent(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Build frequency map
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the element with minimum frequency
        int minFreq = Integer.MAX_VALUE;
        int leastFrequentElement = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() < minFreq) {
                minFreq = entry.getValue();
                leastFrequentElement = entry.getKey();
            }
        }

        // Step 3: Output result
        System.out.println("Least frequent element: " + leastFrequentElement);
        System.out.println("Frequency: " + minFreq);
    }

    public static void main(String[] args) {


      int[] arr = {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
      findLeastFrequent(arr);

    }
}
