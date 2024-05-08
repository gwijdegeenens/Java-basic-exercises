package streams_02;

import java.util.Optional;
import java.util.stream.Stream;

public class PersonStreamApp {

    public static void main(String[] args) {
        Person[] persons = {new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175),
                new Person("Marge", "Simpson", GenderType.FEMALE, 38, 65, 170),
                new Person("Bart", "Simpson", GenderType.MALE, 10, 30, 102),
                new Person("Lisa", "Simpson", GenderType.FEMALE, 8, 25, 95),
                new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65)};

        Stream<Person> personStream = Stream.of(persons);
        //personStream.forEach(System.out::println);
        Optional<Person> reduce = personStream.reduce((p1, p2) -> new Person(p1));
        reduce.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Geen resultaat"));

        Person[] personsLeeg = {};
        Stream<Person> personLeegStream = Stream.of(personsLeeg);
        Optional<Person> reduceEmpty = personLeegStream.reduce((p1, p2) -> new Person(p1));

        reduceEmpty.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Geen resultaat"));


    }
}
