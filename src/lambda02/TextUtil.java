package lambda02;

public final class TextUtil {

    public static String reverse(String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
