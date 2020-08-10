package repl.itAssignments;

import java.util.Scanner;

public class Method_SwitchChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        String message = "";

        switch (response){
            case'y':
               message = "Your request is being processed";
               break;
            case'n':
                message = "Thank you anyway for your consideration";
                break;
            case'h':
                message = "Sorry, no help is currently available";
                break;
            default:
                message = "Invalid entry, please try again!";
            }
        System.out.println(message);
        }
    }

