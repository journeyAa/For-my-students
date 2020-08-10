package day19_SelfPractice;

import java.util.Scanner;

public class containsX {
    public static void main(String[] args) {

        /*1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        boolean containX = word.contains("x");
        String rest = word.substring(word.indexOf("x") +1);

        if(containX) {
            System.out.println(rest);
        }






    }
}
