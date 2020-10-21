package Practice.Practice_Interview_Questions;

import java.util.Scanner;

public class FindingMax_Min {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){
                max =num;
            }
            if(num<min){
                min  =num;
            }

        }
        System.out.println("the maximum number you entered: " + max);
        System.out.println("the minimum number you entered: " + min);













    }
}
