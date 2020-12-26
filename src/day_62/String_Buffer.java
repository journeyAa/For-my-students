package day_62;

public class String_Buffer {
    public static void main(String[] args) {

        String str = new String("Alara");

        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append("School");
      //  sb1.reverse();

        System.out.println(sb1);

        String name = "num";
        String reverse = new StringBuilder(name).reverse().toString();
        System.out.println(name.equals(reverse));

        String s1 = "Friday";

        StringBuilder s2 = new StringBuilder(s1);

        // converting StringBuilder to String
        String s3 = s2.toString();








    }
}
