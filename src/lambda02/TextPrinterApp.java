package lambda02;

public class TextPrinterApp {

    public static void main(String[] args) {
        TextPrinterWithFunction textPrinterWithFunction = new TextPrinterWithFunction("Java is a great program language");

        textPrinterWithFunction.process(s -> s.toUpperCase());
        textPrinterWithFunction.process(s -> s.toLowerCase());
        textPrinterWithFunction.process(s -> s.repeat(2));
        textPrinterWithFunction.process(TextUtil::reverse);
    }
}
