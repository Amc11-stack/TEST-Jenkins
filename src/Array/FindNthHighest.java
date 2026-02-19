package Array;

import java.util.PriorityQueue;

public class FindNthHighest {

    public static void main(String[] args) {

        int[] arr = {10, 25, 3, 99, 45, 67};
        int n = 3; // find 3rd largest

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > n) {
                minHeap.poll(); // remove smallest
            }
        }

        System.out.println(n + "rd largest number: " + minHeap.peek());

    }
}
