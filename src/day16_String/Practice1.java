package day16_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {


        /*warmup tasks:
    1. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana/*


    /*4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = scan.next(); //"apple"

        System.out.println("Enter second word");
        String secondWord = scan.next(); // banana

        String result = firstWord.substring(1).concat(secondWord.substring(1));
        result = firstWord.substring(1) + secondWord.substring(1);

        System.out.println(result);

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action=str.substring(10,15);
        System.out.println(action);

        /* 2. Ask user to enter a word. Print true is the first and last characters
        of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
*/
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() -1 );

        System.out.println(firstChar == lastChar);

        if(firstChar == lastChar){
            System.out.println("true");
            System.out.println(true);
        }else{
            System.out.println("false");
            System.out.println(false);
        }






    }
}
