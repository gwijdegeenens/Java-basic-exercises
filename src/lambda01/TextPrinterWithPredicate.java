package lambda01;

import java.util.function.Predicate;

public class TextPrinterWithPredicate {
    private String sentence;

    public TextPrinterWithPredicate(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(Predicate<String> filter) {
        for (String word : sentence.split(" ")) {
            if (filter.test(word)) {
                System.out.println(word);
            }
        }
    }
}
