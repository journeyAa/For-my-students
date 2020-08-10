package day13_Scanner;

import java.util.Scanner;

public class next_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();

      //  System.out.println(firstName);

       //  Scanner input = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName =scan.next();

        System.out.println("Your full name is: " + firstName + " " + lastName);


    }
}
