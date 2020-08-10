package day07_Unary_ShortHand;

public class LeapYear {
    public static void main(String[] args) {
        /* 1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year
    2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
Collapse



:heavy_check_mark:
8

*/
        int year = 2020;
        boolean result = year % 4 == 0;
        System.out.println("year " + year + " is a leap year: " + result);

        int number = 51;
        boolean divisibleBy2 = number % 2 == 0;
        System.out.println("That the number " + number + " can be evenly divided by 2 is " + divisibleBy2);

        boolean divisibilityBy3 = number % 3 == 0;
        System.out.println("That the number " + number + " can be evenly divided by 3 is " + divisibilityBy3);

        boolean divisibilityBy5 = number % 5 == 0;
        System.out.println("That the number " + number + " can be evenly divided by 5 is " + divisibilityBy5);


    }


}
