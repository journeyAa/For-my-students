package day15_String_classVideo;

import java.util.Scanner;

public class practice2_length {
    public static void main(String[] args) {

        // length return total numbers of the characters as int

        String name = "Alara Baby";

        int l = name.length();
        System.out.println(l);

        int lastIndexNum = name.length() - 1;
        System.out.println(lastIndexNum);

        char lastChar = name.charAt(9);
        System.out.println(lastChar);

        // write a program that ask user to enter a sentence
        // then print out first and last characters

        Scanner input = new Scanner(System.in);

        System.out.println("Give a sentence");
        String sentence = input.nextLine();

        char ch0 = sentence.charAt(0);
        int sl = sentence.length();
        System.out.println(sl);
        int lastIndexNumber = sentence.length() - 1;
        char chaLast = sentence.charAt(15);

        System.out.println(ch0);
        System.out.println(chaLast);







    }
}
