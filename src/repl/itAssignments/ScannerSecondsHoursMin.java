package repl.itAssignments;

import java.util.Scanner;

public class ScannerSecondsHoursMin {

    public static void main(String[] args) {

        /*Write a program that outputs the number of hoursm mins and second that corresponds to input total seconds
        * 'create Scanner object
        * declare int variables inpitsecond, hours, mins, seconds
        * ask user enter seconds by printing
        * "Enter seconds
        * using remainder and find out how many hole hours and mins and second sare inpput seconds
        * assing values to the hours, minuesm second varibales
        * display result */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSeconds = scan.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        System.out.println(hours + " hour, " + minutes + " minutes, and " + seconds + " seconds");







    }
}
