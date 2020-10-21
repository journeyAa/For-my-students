package Practice.Practice_Loop;

import java.util.Scanner;

public class findingMaxMinfromUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers 5 times");
       int max = 0;
        for (int i = 1; i<= 5; i++) {
            int num = scan.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.println("The biggest number you entered is: " + max);


      /*  int min = 2147483647;
        int max = -2147483648;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if(number>max){
                max = number;
            }
            if(number<min){
                min= number;
            }
        }
        System.out.println("the max number you entered" + max);
        System.out.println("The min number you entered" + min);

       */












    }
}
