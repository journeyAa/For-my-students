package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] classmates = {"Aalia", "Nurbiye", "Ayse"};
        // index                 0        1         2
        System.out.println(classmates[1]);

        for (int i = 0; i <= classmates.length-1 ; i++) {
        //   if(classmates[i].charAt(0) != 'A') {
            if(!classmates[i].startsWith("A")){
               continue;
           }
            System.out.println(classmates[i]);

        }
        System.out.println("===============================================================================");

        int[] numbers = new int[5];
        // to print this out, we need Arrays.toString(name); otherwise, when we print it, it will show this==
        //System.out.println(numbers);

        numbers[3] = 25;
        numbers[0] = 100;
        numbers[3] = 25;
        System.out.println(Arrays.toString(numbers));
        System.out.println("=================================================================");

        String[] students = new String[5];
        Scanner scan = new Scanner(System.in);
// this repeats each time when i want to assign the user input to the array
     //   System.out.println("Enter a name");
   //     students[0] = scan.nextLine();  // Muhtar

     //   System.out.println(Arrays.toString(students));

      /*  System.out.println("Enter a name");
        students[1] = scan.nextLine();  // Alper

        System.out.println(Arrays.toString(students));

       */

     /*   for (int i = 0; i <= students.length-1; i++) {
            System.out.println("Enter a name");
            students[i] = scan.nextLine();  // Alper
        }
        System.out.println(Arrays.toString(students));

      */


        System.out.println("==============================================");
        System.out.println("How many names do you want to enter");
       // extra step if i dont use this again:
        // int n = scan.nextInt();
        String[] student = new String[scan.nextInt()];

        scan.nextLine(); // to take out the Enter in scannner
        for (int i = 0; i <= student.length-1; i++) { // i: 012345 stuents
            System.out.println("Enter a name");
            student[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(student));

        // TO REVERSE IT:
        for (int i = student.length-1; i >= 0 ; i--) {
            System.out.println("Enter a name");
            student[i] = scan.nextLine();

        }
        System.out.println(Arrays.toString(student));
























    }
}
