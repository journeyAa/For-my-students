package Practice.Practice_Loop;

import java.util.Scanner;

public class StartingUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scan.next();
        // index =======01234
       boolean upperCase = input.charAt(0) >= 'A' && input.charAt(0) <= 'Z';
       boolean lowerCase = input.charAt(input.length()-1) >= 'a' || input.charAt(input.length()-1) <= 'z';

        System.out.println(upperCase&&lowerCase);





        }






    }
