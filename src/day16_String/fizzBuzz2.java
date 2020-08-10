package day16_String;

import java.util.Scanner;

public class fizzBuzz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        boolean result = word1.length() == 5 && word2.length() == 5;

        if(result){
            boolean b1 = word1.endsWith("" + word2.charAt(0)) ;// word1 ends with first character of word2
            boolean b2 =  word2.startsWith("" + word1.charAt(word1.length()-1)); // word2 starts with frist character of word1
            if(b1 && b2){
                System.out.println("Fizz");
            }
        }else{
            System.out.println("need to be exactly 5 char length");
        }

        System.out.println("" + 'A');
    }
}
