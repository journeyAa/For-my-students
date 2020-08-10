package day15_String_classVideo;

import java.util.Scanner;

public class practice1_charAt {
    public static void main(String[] args) {

        String name = "Cybertek";
        //             0123456789

        // charAt(index):

        char ch1 = name.charAt(0);
        char ch2 = name.charAt(1);


        System.out.println(ch1);
        System.out.println(ch2);



        // write a program that asks user to enter first and last name. output should be the initial

        Scanner scan = new Scanner(System.in);

        System.out.println("first name");
        String firstName = scan.next();
        char ch3 = firstName.charAt(0);

        System.out.println("last name");
        String lastName = scan.next();
        char ch4 = lastName.charAt(0);

        System.out.println("Your initials are " + ch3 + " " + ch4);









    }
}
