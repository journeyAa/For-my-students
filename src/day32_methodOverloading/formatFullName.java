package day32_methodOverloading;

import java.util.Scanner;

public class formatFullName {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String last = scan.nextLine();

        String fullName = formatFullName(first,last);

    /*    firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // convert first char to ipper case       // convert rest of the chars to lower

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

     */


    }
    public static String formatFullName(String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // convert first char to ipper case       // convert rest of the chars to lower

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        return fullName;




    }
}

