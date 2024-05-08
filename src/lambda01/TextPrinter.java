package lambda01;

import java.util.function.Predicate;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word)) {
                System.out.println(word);
            }
        }
    }
}
