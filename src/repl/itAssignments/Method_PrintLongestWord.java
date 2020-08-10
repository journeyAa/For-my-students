package repl.itAssignments;

import java.util.Scanner;

public class Method_PrintLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.next();
        System.out.println("Enter another word");
        String word2 = scan.next();

        int w1l = word1.length();
        int w2l = word2.length();

        if(w1l > w2l){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
    }
}
