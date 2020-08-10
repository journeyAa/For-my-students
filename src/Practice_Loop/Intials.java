package Practice_Loop;

import java.util.Scanner;

public class Intials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        /*String str1 = firstName.substring(0,1);
        String str2 = lastName.substring(0,1);

        System.out.println("Your initial is " + (str1 + str2).toUpperCase());
        */
        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        String inital = "" + ch1 + ch2;
        System.out.println("Your initial is: " + (inital).toUpperCase());




        System.out.println("Enter a word");
       String word = scan.next();

         String str3 = word.substring(0,1);
        String str4 = word.substring(1,word.length());
        String result = str4 + str3;
        System.out.println(result);

        char ch3 = word.charAt(0);
      /*  char ch4 = (char) word.indexOf(1, word.length());

        String reversed = "" + ch4 + ch3;

        System.out.println(reversed); 8*/ // can we do it only in char






































    }
}
