package day15_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next(); //Aalia
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = scan.next(); // Ilham
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: " + ch1 + "." + ch2);


        /// length () = int
        String name = "Aalia";
        int l = name.length();
        System.out.println(l);

        // last index = length of String - 1 ;

        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat (Str)

        String schoolName = "Cybertek";

        schoolName = schoolName.concat(" school"); // Cybertek school

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A' + true;
        System.out.println(r1);





    }
}
