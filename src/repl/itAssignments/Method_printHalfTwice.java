package repl.itAssignments;

import java.util.Scanner;

public class Method_printHalfTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String str1 = word.substring(0,word.length()/2);
        str1 = str1.concat(str1);

        System.out.println(str1);





















    }
}
