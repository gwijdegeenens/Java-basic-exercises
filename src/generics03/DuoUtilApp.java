
package generics03;

import generics01.Duo;

public class DuoUtilApp {

    public static void main(String[] args) {
        Duo<String> duoOfString = new Duo<>("Gwijde", "Geenens");
        DuoUtil.printUpper(duoOfString);

        Duo<Number> duoOfNumber = new Duo<>(5, 6.7d);
        DuoUtil.printSumStrict(duoOfNumber);
        DuoUtil.printSum(duoOfNumber);

        Duo<Integer> duoOfInt = new Duo<>(5, 6);
        DuoUtil.printSum(duoOfInt);
        Duo<Double> duoOfDouble = new Duo<>(5.1d , 6.7d);
        DuoUtil.printSum(duoOfDouble);

        DuoUtil.printFirstElements(duoOfString, new Duo<>("Jan", "Peters"));
        DuoUtil.printFirstElements(duoOfNumber, new Duo<>(7, 8));
        DuoUtil.printFirstElements(duoOfInt, new Duo<>(7, 8));
        DuoUtil.printFirstElements(duoOfDouble, new Duo<>(7.1d, 8.7d));
;
    }
}
