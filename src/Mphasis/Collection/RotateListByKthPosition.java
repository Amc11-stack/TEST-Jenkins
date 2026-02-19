import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListByKthPosition {

    public static void main(String[] args) {
        // Input list
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2; // number of rotations

        System.out.println("Original List: " + list);
        List<Integer> rotatedList = rotateRight(list, k);
        System.out.println("Rotated List: " + rotatedList);
    }

    public static List<Integer> rotateRight(List<Integer> list, int k) {
        int n = list.size();
        if (n == 0) return list;

        // Normalize k (if k > n)
        k = k % n;

        // If no rotation needed
        if (k == 0) return list;

        // Split and combine
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(n - k, n)); // last k elements
        rotated.addAll(list.subList(0, n - k)); // remaining elements

        return rotated;
    }
}
