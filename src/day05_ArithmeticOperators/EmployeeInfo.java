package day05_ArithmeticOperators;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*Warmup tasks:
        1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
        */
        String firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salaray = 120_000.50;

        System.out.println("Employee's full name is: " + firstName + " " + lastName);
        System.out.println("John Daniel's gender is: " + gender);
        System.out.println("John Danile's age is: " + age);
        System.out.println("John Daniel works at: " + companyName);
        System.out.println("John Daniel's job title is: " + jobTitle);
        System.out.println("John Daniel's salary is " + salaray);
        System.out.println("John Danile is full time employee: " + isFullTime);
        System.out.println("John Daniel is married: " + isMarried);

    }
}
