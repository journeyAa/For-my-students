package repl.itAssignments;
//write a program that asks users to input int valuse: area code and localnumber;
// using + to put together in this format and assing to String phone number variable

import java.util.Scanner;

public class scanner_PhoneNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Area Code: ");

        int areaCode = scan.nextInt();

        System.out.println("Enter your Local Number");

        int localNumber = scan.nextInt();

        String phoneNumber = "(" + areaCode + ")" + "-" + localNumber;

        System.out.println("Calling number " + phoneNumber);







    }
}
