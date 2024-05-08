package streams_02;

import java.util.*;
import java.util.stream.IntStream;

public class IntReduceApp {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 9, 7, 4};

        long count = IntStream.of(numbers).count();
        System.out.println(count);

        OptionalInt min = IntStream.of(numbers).min();
        min.ifPresent(m -> System.out.println(m));

        OptionalInt max = IntStream.of(numbers).max();
        max.ifPresent(m -> System.out.println(m));

        OptionalDouble avg = IntStream.of(numbers).average();
        avg.ifPresent(m -> System.out.println(min));

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);

        int sumSquare = IntStream.of(numbers).reduce(0, (acc, el) -> acc + el * el);
        System.out.println(sumSquare);
    }
}
