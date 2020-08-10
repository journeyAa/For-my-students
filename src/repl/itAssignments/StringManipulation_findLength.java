package repl.itAssignments;

import java.util.Scanner;

public class StringManipulation_findLength {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        int lastIndexNum = text.length() ;

        System.out.println("" + text.charAt(0) + text.charAt(lastIndexNum));
        System.out.println(lastIndexNum);

    }
}
