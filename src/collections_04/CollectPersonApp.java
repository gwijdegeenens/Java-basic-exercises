package collections_04;

import java.util.*;

public class CollectPersonApp {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175);
        Person person2 = new Person("Marge", "Simpson", GenderType.FEMALE, 38, 65, 170);
        Person person3 = new Person("Bart", "Simpson", GenderType.MALE, 10, 30, 102);
        Person person4 = new Person("Lisa", "Simpson", GenderType.FEMALE, 8, 25, 95);
        Person person5 = new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65);
        Person person6 = new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons.stream()
                .filter(p -> p.getGender() == GenderType.FEMALE)
                .filter(p -> p.getAge() > 5)
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);


        //old java...
//      List<Person> filteredPeople=new ArrayList<>();
//      for(Person p:persons){
//         if(p.getAge()>5 && p.getGender().equals(GenderType.FEMALE)){
//            filteredPeople.add(p);
//         }
//      }
//      filteredPeople.sort(new Comparator<Person>() {
//         @Override
//         public int compare(final Person o1, final Person o2) {
//            return o1.getAge()-o2.getAge();
//         }
//      });
//      for(Person person:filteredPeople){
//         System.out.println(person);
//      }

    }
}
