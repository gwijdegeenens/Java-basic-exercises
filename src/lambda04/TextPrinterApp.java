package lambda04;

import java.util.function.Consumer;

public class TextPrinterApp {

    public static void main(String[] args) {
        String text = "Java is a great program language";
        Consumer<String> textConsumer = t -> TextPrinter.printWords(t);
        textConsumer.accept(text);

    }
}
