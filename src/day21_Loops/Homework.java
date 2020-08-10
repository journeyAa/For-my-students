package day21_Loops;

import java.util.Scanner;

// use for loop and while loop
/* Write a program that asks user to enter his/her username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account
 */
public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String userName = scan.next();
        System.out.println("Enter your password");
        String passWord = scan.next();

        int attempt = 0;
        while(!(userName.equals("Cyber")&&passWord.equals("tek123"))){
            if(attempt==3) {
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid user name, please re-Enter your user name ");
            userName = scan.next();

            System.out.println("Re-enter your password");
            passWord = scan.next();

            attempt++;

            }
            System.out.println("logged in");



















    }
}
