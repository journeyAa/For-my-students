package day34_WrapperClasses;

public class WrapperClass_Method {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str); // 123

        System.out.println(str+1);   // 1231
        System.out.println(a+1);  // 124

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1);        // 6.5

        String s1 = "true";

        Boolean.parseBoolean(s1);

        boolean b1 =  Boolean.parseBoolean(s1);

        System.out.println(!b1);

        System.out.println("==============================================================================");

        String s2 = "10000.6";

        Double d2 = Double.valueOf(s2);  // unboxing
        System.out.println(d2*2);

      //  parse method ==> primitive    value method ===> wrapper class(!case-sensitive)










    }
}
