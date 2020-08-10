package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word");
        String secondWord = scan.next();

        String result = (firstWord.equalsIgnoreCase(secondWord))? "Equal" : "Not Equal";

        System.out.println(result);







    }
}
