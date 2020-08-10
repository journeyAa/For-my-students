package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: "); //120000
        double salary = scan.nextDouble();

        scan.nextLine();  // enter // we use it to take out the Enter that is left in the scanner,
        // so that next line takes out enter
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary " + salary);
        System.out.println("full name: " + fullName);
        // it only occurs when you use nextline after other methods of scanner




    }
}
