package day15_String;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        String fullName = firstName.concat(" ".concat(lastName));  // first and last name
        System.out.println("Your full name is: " .concat(fullName));

        // toLowerCase():

        String name1 = "CYBERTEK SCHOOL";
                        name1 = name1.toLowerCase(); // Cybertek school

        System.out.println(name1);

        // toUpperCase();

        String name2 = "aalia";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        //trim();

        String p = "     Cybertek Scholl      ";
        p = p.trim();
        System.out.println(p);

        // substring creates the subString of the string
        // 1. substring(beg index, ending index): crates the
        // substring from the given beginnning index till ending index(exluded)
















    }



}
