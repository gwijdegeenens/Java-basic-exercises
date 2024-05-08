package collections_01;

import java.util.*;

public class StringListApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<String> words = new ArrayList<String>();
      
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
