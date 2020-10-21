package Practice.Practice_Loop;

import java.util.Scanner;

public class findingMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // to find the max number, we can give a min num that is possible, so no matter what number the user inputs,
        // it will be always bigger than the min number we gave, so that it it will be assigned to max
        int max = -2147483648;

      /*  for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){
                max = num;
            }

        }
        System.out.println(max);

       */

       /* int j = 1;
        while (j <= 5) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){
                max=num;
            }
            j++;
        }
        System.out.println(max);

        */

        // in order to find the max num the user input, we provide the smallest num possible, so no matter
        // what number the user gives, it is always bigger than this num, so that we can assing to the max

       int min= 2147483647;

       /* for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num1 = scan.nextInt();
            if(num1<min){
                min = num1;
            }
        }
        System.out.println(min);

        */

        for (int n = 1; n <= 5; n++) {
            System.out.println("Enter random 5 numbers");
            int number = scan.nextInt();
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }

        System.out.println("the biggest num you entered is : " + max);
        System.out.println("the smallest num you entered is: " + min);















    }
}
