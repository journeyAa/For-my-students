package repl.itAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        String email = "info@cybertek@school.com";
       String[] arr =  email.split("@");

        System.out.println(Arrays.toString(arr));

        if(arr.length==2){
            System.out.println("Email id: " + arr[0]);
            System.out.println("Email domain: " + arr[1]);
        }else{
            System.out.println("invalid email");
        }
        int num = 0;


       /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        num = scan.nextInt();
        digit5 = num % 10;
        num = num/10;
        digit4 = num%10;
        num= num/10;
        digit3 = num%10;
        num = num/10;
        digit2 = num%10;
        num = num/10;
        digit1 = num%10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);


        /*

        int num = 12345;
        int digit1 = 12345 / 10000;   //1
      //  int digit2 =  12345 % 10000;   // 2345
        int digit2 = 2345/ 1000;   // 2
        // int  digit3 = 2345 % 1000 // 345
        int digit3 = 345/ 100;  //3
        // int 345  % 100 == 45
        int digit4 = 45 / 10;  // 4
        // int 45 % 10;    5
        int digit5 = 45 % 10; // 5

         */



















    }
}
