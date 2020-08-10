package day16_String;

import java.util.Scanner;

public class Practice_equals {
    public static void main(String[] args) {
        /* // ask the user if he/she is employed
        // if the user says yes, then print "employed", if not == unemployed

        Scanner scan = new Scanner(System.in);

        System.out.println();

*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed?");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        }else{
            System.out.println("Not Employed");
        }

        // contains:

        String str = "I like to learn Java programming language";
        System.out.println();

        System.out.println(str.contains("python"));// false
        System.out.println(!str.contains("python"));  // true

        System.out.println(str.contains("java")); // true
        System.out.println(str.contains("JAVA"));  // false

        // startWith  : checks if the given string is started with the given str.
        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J")); // true

        System.out.println(s1.startsWith("Mu")); // true

        // endsWith(str) _ checks if the string is ended with the given str returns boolean











    }
}
