package Practice.Practice_Loop;

import java.util.Scanner;

// write a program that ask user to enter his/her username and password until user enters correctly
public class EnterPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String password = "Alper123";
        System.out.println("Enter your password");
        String input = scan.nextLine();


        while(!input.equals(password)) {
            System.out.println("Re-enter your password");
            input = scan.nextLine();

        }
        System.out.println("logged in");



    }
}
