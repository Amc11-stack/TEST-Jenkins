import java.util.*;
import java.util.stream.Collectors;

public class StreamAPITest {


    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(40, 15, 25, 20, 35, 7, 5, 45, 50, 55, 3, 60, 65, 20, 35);

        printNumbersGreaterThan50(lst);
        countNumbersLessThan50(lst);
        findTotalElements(lst);
        findMaxNumber(lst);
        findSecondLeastNumber(lst);
        findAverage(lst);
        sortDescending(lst);
        reverseEachNumber(lst);
        listPrimeNumbers(lst);
        printOddNumbers(lst);
        printDuplicateNumbers(lst);
        printSquareValues(lst);
        printDistinctElements(lst);
        findSumOfNumbers(lst);
        checkIf25IsPresent(lst);
    }

    public static void printNumbersGreaterThan50(List<Integer> lst) {
        System.out.println("Numbers greater than 50: " + lst.stream().filter(n -> n > 50).collect(Collectors.toList()));
    }

    public static void countNumbersLessThan50(List<Integer> lst) {
        long count = lst.stream().filter(n -> n < 50).count();
        System.out.println("Count of numbers less than 50: " + count);
    }

    public static void findTotalElements(List<Integer> lst) {
        System.out.println("Total number of elements: " + lst.size());
    }

    public static void findMaxNumber(List<Integer> lst) {
        System.out.println("Max number: " + Collections.max(lst));
    }

    public static void findSecondLeastNumber(List<Integer> lst) {
        Integer secondLeast = lst.stream().sorted().distinct().skip(1).findFirst().orElse(null);
        System.out.println("Second least number: " + secondLeast);
    }

    public static void findAverage(List<Integer> lst) {
        double average = lst.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average of numbers: " + average);
    }

    public static void sortDescending(List<Integer> lst) {
        List<Integer> sortedList = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("List sorted in descending order: " + sortedList);
    }

    public static void reverseEachNumber(List<Integer> lst) {
        List<Integer> reversedNumbers = lst.stream()
                .map(n -> Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println("Reversed numbers: " + reversedNumbers);
    }

    public static void listPrimeNumbers(List<Integer> lst) {
        List<Integer> primes = lst.stream().filter(StreamAPITest::isPrime).collect(Collectors.toList());
        System.out.println("Prime numbers: " + primes);
    }

    public static void printOddNumbers(List<Integer> lst) {
        System.out.println("Odd numbers: " + lst.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));
    }

    public static void printDuplicateNumbers(List<Integer> lst) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = lst.stream().filter(n -> !unique.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicate numbers: " + duplicates);
    }

    public static void printSquareValues(List<Integer> lst) {
        List<Integer> squares = lst.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Square values: " + squares);
    }

    public static void printDistinctElements(List<Integer> lst) {
        List<Integer> distinct = lst.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements (insertion order): " + distinct);
    }

    public static void findSumOfNumbers(List<Integer> lst) {
        int sum = lst.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers: " + sum);
    }

    public static void checkIf25IsPresent(List<Integer> lst) {
        boolean isPresent = lst.stream().anyMatch(n -> n == 25);
        System.out.println("Is 25 present in the list? " + isPresent);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
