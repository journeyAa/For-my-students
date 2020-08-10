package Practice_Loop;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String reversedW = "";

        for (int i = word.length()-1; i >= 0; i--) {
           // reversedW += word.charAt(i);
            reversedW += word.substring(i, i+1);
        }
        System.out.println(word.equals(reversedW));

















    }
}
