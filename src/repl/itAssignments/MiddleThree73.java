package repl.itAssignments;
/*You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".*/

import java.util.Scanner;

public class MiddleThree73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int middleIndex = word.length() / 2;

        char middleChar = word.charAt(middleIndex);

        if(word.length() % 2 == 1 && word.length() >= 5){
            System.out.println("" + word.charAt(middleIndex-1) + word.charAt(middleIndex) + word.charAt(middleIndex + 1));
        }else{
            System.out.println("Invalid");
        }


















            }
        }







