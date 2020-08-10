package day06_ComparisonOperations;

public class inplicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;
        System.out.println(l1); //implicit casting - automatically done

        long l2 = (long)s1;
        System.out.println(l2); // explicit casting - done manually

        int I1 = 300;
        double D1 = I1;
        System.out.println(D1);

        int I2 = 10;
        byte B2 = (byte)I2;

        int I4 = 128;
        byte B4 = (byte)I4;
        System.out.println(B4);

        double longNumber1 = 586.356;
        byte byteNumber1 = (byte)longNumber1;
        System.out.println(byteNumber1);

        int a = 50;
        a = -- a + a++ + --a;
        System.out.println(a);





    }

}
