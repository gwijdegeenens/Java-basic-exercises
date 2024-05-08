package collections_01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class NumberListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (stop with 0):");

        List<Integer> numbers = new ArrayList<Integer>();

        int number = 0;
        while ((number = scanner.nextInt()) != 0) {
            numbers.add(number);
        }
        scanner.close();

        numbers.forEach(System.out::println);

        // streams solution
        /*
        int sum = numbers.stream()
                         .mapToInt(Integer::valueOf) // of i -> i
                         .sum();
        OptionalDouble avg = numbers.stream()
                                    .mapToInt(Integer::valueOf) // of i -> i
                                    .average();
        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + (avg.isPresent() ? avg.getAsDouble() : ""));
         */

        //no streams solution;
        int mySum = 0;
        for (Integer currentNumber : numbers) {
            mySum += currentNumber;
        }
        Double myAvg = (double) mySum / numbers.size();
        System.out.println("mySum : " + mySum);
        System.out.println("myAvg : " + myAvg);

    }
}
