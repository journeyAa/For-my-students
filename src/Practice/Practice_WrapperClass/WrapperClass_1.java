package Practice.Practice_WrapperClass;

public class WrapperClass_1 {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str);

        System.out.println(a+1);

        String b = "10.5";
        Double d = Double.parseDouble(b);
        System.out.println(d + 1);

        String s1 = "TRUE";

        boolean s2 = Boolean.parseBoolean(s1);
        System.out.println(!s2);

        String s3 = "10000000";
        double d3 = Double.valueOf(s3);  //unboxing

        String s4 = "fALse";
        Boolean b4 = Boolean.valueOf(s4);
        System.out.println(!b4);




    }
}
