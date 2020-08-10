package day15_String_classVideo;

import java.util.Scanner;

public class practice4_toLowerCase_UpperCase {
    public static void main(String[] args) {

        String name1 = "CYBERTEKSCHOOL";
        name1 = name1.toLowerCase();

        System.out.println(name1);

        String name2 = "alara";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        // ask user to enter first and last name then print out the full name in all upper case

        Scanner scan = new Scanner(System.in);
        System.out.println("first name");
        String firstName = scan.next();

        System.out.println("last name");
        String lastName = scan.next();

        String fullName = firstName.concat(lastName);
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // ask user to enter two string then print the longest string

        System.out.println("sentence 1");
        String sentence1 = scan.nextLine();

        scan.nextLine();

        System.out.println("sentence 2");
        String sentence2 = scan.nextLine();

        int lS1 = sentence1.length();
        int lS2 = sentence2.length();

        if(lS1 > lS2){
            System.out.println(sentence1);
        }else{
            System.out.println(sentence2);
        }

        // ask user to enter two words then add them together and print

        System.out.println("enter a word");
        String word1 = scan.next();
        System.out.println("enter another word");
        String word2 = scan.next();

        word2 = word1.concat(word2);
        System.out.println(word2);








    }
}
