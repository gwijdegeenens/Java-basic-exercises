package generics02;

public class NumberDuoApp {

    public static void main(String[] args) {
        NumberDuo<Integer> duoOfInt = new NumberDuo<>(5, 6);
        duoOfInt.swap();
        System.out.println(duoOfInt.getFirst() + " " + duoOfInt.getSecond());

        NumberDuo<Double> duoOfDouble = new NumberDuo<>(5.1d , 6.7d);
        duoOfDouble.swap();
        System.out.println(duoOfDouble.getFirst() + " " + duoOfDouble.getSecond());
    }
}
