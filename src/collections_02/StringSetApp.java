package collections_02;

import java.util.*;

public class StringSetApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Set<String> words = new HashSet<>();

      String word = null;
      do {
         word = scanner.next();
         words.add(word);
      }
      while(!word.endsWith("."));
      scanner.close();

      for(String w : words) {
         System.out.println(w);
      }

      System.out.println("Number of words: " + words.size());

      words.forEach(System.out::println);
   }
}
