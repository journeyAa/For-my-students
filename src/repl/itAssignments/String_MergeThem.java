package repl.itAssignments;

import java.util.Scanner;

public class String_MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();

        int word1l = word1.length();
        int word2l = word2.length();

        if(word1l == 3 && word2l == 3){
            char ch1 = word1.charAt(0);
            char ch11 = word2.charAt(0);
            char ch2 = word1.charAt(1);
            char ch22 = word2.charAt(1);
            char ch3 = word1.charAt(2);
            char ch33 = word2.charAt(2);

            String merge = ""+ ch1 + ch11 + ch2 + ch22 + ch3 + ch33;
            System.out.println(merge);
        }else{
            System.out.println("cannot merge");
        }
    }
}
