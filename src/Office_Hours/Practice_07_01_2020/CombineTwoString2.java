package Office_Hours.Practice_07_01_2020;

import java.util.Scanner;

public class CombineTwoString2 {
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

        String s1 = str1.substring(str1.length() - 1);
        String s2 = str2.substring(0 ,1);

        if(s1.equals(s2)){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1 + str2);
        }




    }

}
