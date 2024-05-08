package collections_03;

import java.util.*;


public class SortPersonApp {
   public static void main(String[] args) {
      // Natural order
//       Set<Person> persons = new TreeSet<Person>();

      // Sorted by age
//       Set<Person> persons = new TreeSet<Person>(new AgeComparator());

      // Sorted by weight
//      Set<Person> persons = new TreeSet<Person>(
//         new Comparator<Person>() {
//            public int compare(Person p1, Person p2) {
//               return Float.compare(p1.getWeight(), p2
//                  .getWeight());
//            }
//         });

      // Sorted by age than lastname and then weight
      TreeSet<Person> persons = new TreeSet<Person>(Comparator.comparingInt(Person::getAge)
                                                        .thenComparing(Person::getLastName)
                                                        .thenComparingDouble(Person::getWeight));

      Person person1 = new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175);
      Person person2 = new Person("Marge", "Simpson", GenderType.FEMALE,38,65, 170);
      Person person3 = new Person("Bart", "Simpson", GenderType.MALE,10, 30,102);
      Person person4 = new Person("Lisa", "Simpson", GenderType.FEMALE,8, 25,95);
      Person person5 = new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65);
      Person person6 = new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65);
      System.out.println(person5.equals(person6));
      System.out.println(person5.hashCode());
      System.out.println(person6.hashCode());
      persons.add(person1);
      persons.add(person2);
      persons.add(person3);
      persons.add(person4);
      persons.add(person5);
      persons.add(person6);
      persons.forEach(System.out::println);
   }
}
