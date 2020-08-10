package repl.itAssignments;

import java.util.Scanner;

public class Method_reverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int wordl = word.length();

        if(wordl == 5){
            char ch0 = word.charAt(0);
            char ch1 = word.charAt(1);
            char ch2 = word.charAt(2);
            char ch3 = word.charAt(3);
            char ch4 = word.charAt(4);
            String reverse = ""+ch4 + ch3 + ch2 + ch1 + ch0;
            System.out.println(reverse);
        }else if (wordl > 5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }





    }
}
