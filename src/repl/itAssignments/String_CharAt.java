package repl.itAssignments;

import java.util.Scanner;

public class String_CharAt {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter a word");
        String txt = s.next();

        char c1 = txt.charAt(2);
        char c2 = txt.charAt(4);
        char c3 = txt.charAt(5);

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);

        String st = txt.substring(0,1);
        System.out.print(st);
    }
}
