package lambda01;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);
}
