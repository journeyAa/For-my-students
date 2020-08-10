package day33_LocalDataTime;

import java.text.DecimalFormat;

public class FormatDecimal {
    public static void main(String[] args) {

        DecimalFormat m = new DecimalFormat();

        double a = 22/7.0;
        System.out.println(a);

        System.out.println(m.format(a));

        System.out.println(m.format(6));









    }
}
