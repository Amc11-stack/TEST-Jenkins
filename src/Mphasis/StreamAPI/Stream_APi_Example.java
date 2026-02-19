import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream_APi_Example {

    public static void main(String[] args) {
        // Example inputs
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        filterEvenNumbers(numbers);
        convertStringsToUppercase(strings);
        findSumOfIntegers(numbers);
        findMaxValue(numbers);
        findMinValue(numbers);
        countElements(numbers);
        sortStringsAlphabetically(strings);
        findDistinctElements(numbers);
        limitStreamElements(numbers, 3);
        skipStreamElements(numbers, 2);
        mapToSquares(numbers);
        collectStreamElements(numbers);
        groupStringsByLength(strings);
        partitionEvenAndOdd(numbers);
        joinStringsWithDelimiter(strings, ", ");
        findFirstElement(numbers);
        reduceToSum(numbers);
        flattenListOfLists();
        generateInfiniteRandomNumbers();
        processWithParallelStreams(numbers);
    }

    public static void filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }

    public static void convertStringsToUppercase(List<String> strings) {
        List<String> uppercased = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercased strings: " + uppercased);
    }

    public static void findSumOfIntegers(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of integers: " + sum);
    }

    public static void findMaxValue(List<Integer> numbers) {
        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Maximum value: " + max);
    }

    public static void findMinValue(List<Integer> numbers) {
        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Minimum value: " + min);
    }

    public static void countElements(List<Integer> numbers) {
        long count = numbers.stream().count();
        System.out.println("Number of elements: " + count);
    }

    public static void sortStringsAlphabetically(List<String> strings) {
        List<String> sorted = strings.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted strings: " + sorted);
    }

    public static void findDistinctElements(List<Integer> numbers) {
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: " + distinct);
    }

    public static void limitStreamElements(List<Integer> numbers, int limit) {
        List<Integer> limited = numbers.stream().limit(limit).collect(Collectors.toList());
        System.out.println("Limited elements: " + limited);
    }

    public static void skipStreamElements(List<Integer> numbers, int skip) {
        List<Integer> skipped = numbers.stream().skip(skip).collect(Collectors.toList());
        System.out.println("Skipped elements: " + skipped);
    }

    public static void mapToSquares(List<Integer> numbers) {
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squares: " + squares);
    }

    public static void collectStreamElements(List<Integer> numbers) {
        List<Integer> collected = numbers.stream().collect(Collectors.toList());
        System.out.println("Collected elements: " + collected);
    }

    public static void groupStringsByLength(List<String> strings) {
        Map<Integer, List<String>> grouped = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + grouped);
    }

    public static void partitionEvenAndOdd(List<Integer> numbers) {
        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned (even/odd): " + partitioned);
    }

    public static void joinStringsWithDelimiter(List<String> strings, String delimiter) {
        String joined = strings.stream().collect(Collectors.joining(delimiter));
        System.out.println("Joined strings: " + joined);
    }

    public static void findFirstElement(List<Integer> numbers) {
        int first = numbers.stream().findFirst().orElseThrow();
        System.out.println("First element: " + first);
    }

    public static void reduceToSum(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Reduced sum: " + sum);
    }

    public static void flattenListOfLists() {
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flattened = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened);
    }

    public static void generateInfiniteRandomNumbers() {
        new Random().ints().limit(5).forEach(System.out::println);
    }

    public static void processWithParallelStreams(List<Integer> numbers) {
        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum using parallel streams: " + sum);
    }
}
