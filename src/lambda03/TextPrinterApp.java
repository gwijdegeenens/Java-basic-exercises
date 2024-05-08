package lambda03;

import lambda02.TextUtil;


public class TextPrinterApp {

    public static void main(String[] args) {

        TextPrinter.printFilteredWords(() -> "Java is a great program language", s -> s.toUpperCase());
        TextPrinter.printFilteredWords(() -> "Java is a great program language", s -> s.toLowerCase());
        TextPrinter.printFilteredWords(() -> "Java is a great program language", s -> s.repeat(2));
        TextPrinter.printFilteredWords(() -> "Java is a great program language", TextUtil::reverse);
    }
}
