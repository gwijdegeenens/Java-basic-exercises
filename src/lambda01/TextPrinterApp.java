package lambda01;

public class TextPrinterApp {

    public static void main(String[] args) {
        TextPrinterWithPredicate textPrinterWithPRedicate = new TextPrinterWithPredicate("Java is a great program language");

        textPrinterWithPRedicate.printFilteredWords(s -> s.contains("e"));
        textPrinterWithPRedicate.printFilteredWords(s -> s.length() > 4);
        textPrinterWithPRedicate.printFilteredWords(s -> s.startsWith("a"));
    }
}
