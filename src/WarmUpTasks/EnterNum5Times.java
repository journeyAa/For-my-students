package WarmUpTasks;
/* 2. write a program that can ask the user enter a number for five times and the returns
the sum of those five numbers*/


import java.util.Scanner;

public class EnterNum5Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan. nextInt();
            sum += num;

        }

        System.out.println(sum);
























    }
}
