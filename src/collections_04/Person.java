package collections_04;

import java.util.Objects;

public class Person implements Comparable<Person>{
   private String firstName;
   private String lastName;
   private GenderType gender;
   private Integer age;
   private float weight;
   private float height;
   
   public Person() {
   }
   
   public Person(String firstName, String lastName, GenderType gender, Integer age,
                 float weight, float height) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.age = age;
      this.weight = weight;
      this.height = height;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public GenderType getGender() {
      return gender;
   }

   public void setGender(GenderType gender) {
      this.gender = gender;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public float getWeight() {
      return weight;
   }

   public void setWeight(float weight) {
      this.weight = weight;
   }

   public float getHeight() {
      return height;
   }

   public void setHeight(float height) {
      this.height = height;
   }

   @Override
   public int compareTo(Person o) {
      return this.getLastName().compareTo(o.getLastName());
   }

   @Override
   public String toString() {
      return String.format("Person [firstName=%s, lastName=%s, gender=%s, age=%s, weight=%s, height=%s]",
                  firstName, lastName, gender, age, weight, height);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return age == person.age && Float.compare(person.weight, weight) == 0 && Float.compare(person.height, height) == 0 && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender;
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstName, lastName, gender, age, weight, height);
   }

}
