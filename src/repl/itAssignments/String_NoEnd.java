package repl.itAssignments;

import java.util.Scanner;

public class String_NoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String txt = s.next();

        String sub = txt.substring(0,txt.length()-1);
        System.out.println(sub);
    }
}
