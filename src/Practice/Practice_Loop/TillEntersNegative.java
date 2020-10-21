package Practice.Practice_Loop;
/*3. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop*/
import java.util.Scanner;

public class TillEntersNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i== 0;) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num >= 0){
                sum += num;
            }else{
                break;
            }
        }
        System.out.println(sum);








    }
}
