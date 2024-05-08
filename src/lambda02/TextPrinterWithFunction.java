package lambda02;

import java.util.function.Function;

public class TextPrinterWithFunction {
    private String sentence;

    public TextPrinterWithFunction(String sentence) {
        this.sentence = sentence;
    }

    public void process(Function<String, String> processor) {
        for (String word : sentence.split(" ")) {
            System.out.print(processor.apply(word) + " ");
        }
        System.out.println();
    }
}
