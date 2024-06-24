package util;

public class Conversion {
    public static double DOLLAR_PRICE = 3.10;
    public static double IOF = 0.06;

    public static double convert(double quantity){
        return quantity * DOLLAR_PRICE * (1.0 + IOF);
    }
}
