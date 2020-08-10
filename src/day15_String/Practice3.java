package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        // System.out.println(sentence.charAt(0));// print out the first character
        //System.out.println(sentence.charAt(sentence.length()-1));// from the length of the string, -1
        // or we can do

        int lastIndexNum = sentence.length() -1;

        System.out.println("" + sentence.charAt(0) + sentence.charAt(lastIndexNum));

       //  System.out.println("" + sentence.charAt(0) + );


























    }
}
