package day16_String;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class String_Methods2 {
     /*
        1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter
     of first word and first letter of second word are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If

         */

    public static void main(String[] args) {

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        //

        String st1 = "Java";                     // String pool
        String st2 = new String("Java");  // heap
        if(st1 == st2){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

        // only to compare the visible text st1.equals();

        System.out.println(st1.equals(st2));

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);  // false. each time new created new String
        System.out.println(str1.equals(str2));

        String str3 = "Java";
        String str4 = "Java";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = "JAVA";
        String str6 = "java";

        System.out.println(str5.equals(str6));


        //equalsIgnoreCase();

        System.out.println(str5.equalsIgnoreCase(str6));




























    }

    //
}
