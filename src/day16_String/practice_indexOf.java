package day16_String;

public class practice_indexOf {

    public static void main(String[] args) {

        String str = "Cybertek";
                str.indexOf("r");

        String s1 = "I like to stay in Cybertek, we are learning Java";
        int r1 = s1.indexOf("r");
        int r2 = s1.indexOf("re");
        int r3 = s1.indexOf("rn");

        System.out.println(r1);
        System.out.println(s1.charAt((r1)));
        System.out.println(r2);
        System.out.println(r3);


        // lastIndexOf()

        String s2 = "Java is a programming language, and Java is fun";
        int i2 = s2.indexOf("J");
        int i1 = s2.lastIndexOf("J");


        System.out.println(i2);
        System.out.println(i1);

        String s3 = "Java";
        int a = s3.indexOf("a");
        System.out.println(a);
        int b = s3.lastIndexOf("a");
        System.out.println(b);







    }



}
