package generics03;

import generics01.Duo;

public class DuoUtil {
    public static void printUpper(Duo<String> duo) {
        System.out.println(duo.getFirst().toUpperCase() + " " + duo.getSecond().toUpperCase());
    }
    public static void printSumStrict(Duo<Number> duo) {
        double sum = duo.getFirst().doubleValue() + duo.getSecond().doubleValue();
        System.out.println(sum);
    }
    public static void printSum(Duo<? extends Number> duo) {
        double sum = duo.getFirst().doubleValue() + duo.getSecond().doubleValue();
        System.out.println(sum);
    }
    public static <T> void printFirstElements(Duo<T> duo1, Duo<T> duo2) {
        System.out.println("duo1.first : " + duo1.getFirst() + " duo2.first : " + duo2.getFirst());
    }
}
