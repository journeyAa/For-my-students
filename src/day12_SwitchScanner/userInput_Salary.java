package day12_SwitchScanner;

import java.util.Scanner;

// write a program for the rate calculator
// ask the user to enter the salary (double)
// ask the user how mnay hours does she works in a week (int)
// print the hourly rate of the employee

// hourRate = Salaray / (weeklyHour * 52)


public class userInput_Salary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your annual salaray ");
        double salaray = input.nextDouble();
        System.out.println("How many hours do you work in a week? ");
        int weeklyHour = input.nextInt();

        int totalHours = weeklyHour * 52;

        double  hourlyRate = salaray / totalHours;

        System.out.println("Your hourly rate is: $" + hourlyRate);


    }
}
