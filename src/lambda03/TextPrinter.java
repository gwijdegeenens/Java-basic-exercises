package lambda03;

import java.util.function.Function;
import java.util.function.Supplier;

public final class TextPrinter {


    public static void printFilteredWords(Supplier<String> supplier, Function<String, String> processor) {
        String sentence = supplier.get();
        for (String word : sentence.split(" ")) {
            System.out.print(processor.apply(word) + " ");
        }
        System.out.println();
    }
}
