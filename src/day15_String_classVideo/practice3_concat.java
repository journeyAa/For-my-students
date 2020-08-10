package day15_String_classVideo;

import java.util.Scanner;

public class practice3_concat {
    public static void main(String[] args) {
        // concatenation == concates the given string to the string, returns string

        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" school");

        System.out.println(schoolName);

        // write a program to ask first, last name

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter last name");
        String lastName = scan.next();

        String fullName = firstName.concat(" ".concat(lastName));
        System.out.println(fullName);












    }
}
