package day17_String_review;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.DoubleToIntFunction;

public class String_Method2 {
    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        System.out.println("===============================================================");

        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        //
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        // isEmpty: checks if the length of String is 0

        String str = "";
        str = str.trim();
        System.out.println(str.isEmpty());

        // contains:

        String str3 = "Java, c#, Pythonn, Ruby, c++";
        System.out.println(str3.concat("Java")); // true
        System.out.println(str3.contains("java"));  // false

        System.out.println(str3.toLowerCase().contains("java"));  // true

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));

        // startsWith & endsWith

        String str5 = "Cybertek School";
        System.out.println(str5.startsWith("Cyber"));





    }
}
