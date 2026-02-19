import java.util.Arrays;
import java.util.List;

public class FindPair_With_Given_Sum {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9);
        int target = 10;

        findPairs(nums, target);
    }

    public static void findPairs(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        System.out.println("Pairs with sum = " + target + " are:");

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);

            if (sum == target) {
                System.out.println("[" + nums.get(left) + ", " + nums.get(right) + "]");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
