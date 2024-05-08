package lambda02;

import java.util.function.Function;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor) {
        for (String word : sentence.split(" ")) {
            System.out.print(processor.process(word) + " ");
        }
        System.out.println();
    }
}
