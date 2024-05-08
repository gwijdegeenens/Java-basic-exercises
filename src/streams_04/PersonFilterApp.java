package streams_04;

import java.util.*;
import java.util.stream.Stream;

public class PersonFilterApp {

    public static void main(String[] args) {
        Person[] persons = {new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175),
                new Person("Marge", "Simpson", GenderType.FEMALE, 38, 65, 170),
                new Person("Bart", "Simpson", GenderType.MALE, 10, 30, 102),
                new Person("Lisa", "Simpson", GenderType.FEMALE, 8, 25, 95),
                new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65)};

        Stream.of(persons)
                .filter(p -> p.getGender() == GenderType.FEMALE)
                .forEach(System.out::println);

        Stream.of(persons)
                .filter(p -> p.getAge() > 10)
                .forEach(System.out::println);

        Stream.of(persons)
                .filter(p -> p.getWeight() > 30)
                .filter(p -> p.getWeight() < 80)
                .forEach(System.out::println);

        Stream.of(persons)
                .filter(p -> p.getAge() > 30)
                .filter(p -> p.getWeight() > 80)
                .forEach(System.out::println);

        Stream.of(persons)
                .mapToInt(Person::getAge)  // p -> p.getAge()
                .forEach(System.out::println);

        Stream.of(persons)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .forEach(System.out::println);

        OptionalDouble avg = Stream.of(persons)
                .mapToInt(Person::getAge)
                .average();
        avg.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));

        OptionalInt min = Stream.of(persons)
                .mapToInt(Person::getAge)
                .min();
        min.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));

        OptionalInt max = Stream.of(persons)
                .mapToInt(Person::getAge)
                .max();
        max.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));

        Stream.of(persons)
                .mapToDouble(Person::getWeight)
                .forEach(System.out::println);

        OptionalDouble avgWeight = Stream.of(persons)
                .mapToDouble(Person::getWeight)
                .average();
        avgWeight.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));

        OptionalDouble minWeight = Stream.of(persons)
                .mapToDouble(Person::getWeight)
                .min();
        minWeight.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));

        OptionalDouble maxWeight = Stream.of(persons)
                .mapToDouble(Person::getWeight)
                .max();
        maxWeight.ifPresentOrElse(System.out::println, () -> System.out.println("Geen resultaat"));
    }
}
