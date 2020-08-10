package day19_SelfPractice;

import java.util.Scanner;

public class twoWords {
    public static void main(String[] args) {

        /*Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter
is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();

        char ch1 = word1.charAt(word1.length() - 1);
        char ch2 = word1.charAt(0);
        String str2 = word2.substring(1);

        if(ch1 == ch2){
            System.out.println(word1 + str2);
        }else{
            System.out.println(word1 + word2);
        }




















    }
}
