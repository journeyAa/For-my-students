package day14_Recap;
/*building number nextInt -- nextLine
* street address nextLine
* city name nextLine
* state name next()
* zip code  nextInt --- nextLine
* full name
* */
import javax.swing.*;
import java.util.Scanner;

public class address {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.next();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        // Ship To :    Jimmy Joe
                        //7653 Jones Brach DropMode
                        //MCLean, VA 220165
        scan.close();


    }
}
