package repl.itAssignments;

import java.util.Scanner;

public class Method_EqualNot {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String name = inp.nextLine();

        if(name.equalsIgnoreCase("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }

    }
}
