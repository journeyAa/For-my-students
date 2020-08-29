package Office_Hours.Practice_07_01_2020;

import java.util.Scanner;

public class CombineTwoString {
    public static void main(String[] args) {
        /*Warm up task
        * Ask user to enter two words, then add them together and print. but if the last letter is the first
        * word and the first letter of the last letter is the same, print that character once
        *                       input:
        *                               one
        *                                eight
        * output                         oneight*/


        Scanner scan = new Scanner(System.in);
        String str1 = "One";
        String str2 = "eight";

        char ch1 = str1.charAt(str1.length() - 1);
        char ch2 = str2.charAt(0);
        String str3 = str2.substring(1);

        if(ch1 == ch2){
            System.out.println(str1 + str3);
        }else{
            System.out.println(str1 + str2);
        }







    }
}
