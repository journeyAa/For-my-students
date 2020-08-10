package Practice_Loop;

import java.util.Scanner;

public class untilNegativve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i>0;){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num<0){
                break;
            }
            if(num>0){
                sum += num;
            }
        }
        System.out.println(sum);


        System.out.println();
        System.out.println("================================================================" );
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorialNum = 1;


        for (int i = number; i>0  ; i--) {
            factorialNum *= i;
        }
        System.out.println(factorialNum);





    }
}
