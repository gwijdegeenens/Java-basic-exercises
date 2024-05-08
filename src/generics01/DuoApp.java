package generics01;

public class DuoApp {

    public static void main(String[] args) {
        Duo<String> duoOfString = new Duo<>("Gwijde", "Geenens");
        duoOfString.swap();
        System.out.println(duoOfString.getFirst() + " " + duoOfString.getSecond());

        Duo<Integer> duoOfInt = new Duo<>(5, 6);
        duoOfInt.swap();
        System.out.println(duoOfInt.getFirst() + " " + duoOfInt.getSecond());
    }
}
