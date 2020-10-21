package Practice.Practice_Loop;

import java.util.Scanner;

/*write a program that can ask the user enter a number for five times and the
returns the sum of those five numbers*/
public class FiveNums {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);










    }
}
