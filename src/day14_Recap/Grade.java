package day14_Recap;

import java.util.Scanner;

/*1. write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
        2. write a program that can calculate the tax based on the annual salary
                    1. ask the user enter the annual salary
                    2. ask user to enter the full name
                    3. ask user enter marrid status (use nextBoolean() method this time)
                    assume that the normal tax rate for a person is set to 25 %. if he/she
                    is married tax rate will be set to 20%*/

public class Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        scan.close(); // closes the printing statement and wont allow the user to use the console anymore

        String result = "";

        if(score >= 0 && score <= 100){  // 5 possible outcomes
            if(score >= 90){
                result = "Excellent";
            }else if(score >= 80){
                result = "Great";
            }else if(score >= 70){
                result = "Good";
            }else if(score >= 60){
                result = "Passed";
            }else{
                result = "failed";
            }

        }else{
            result = "Invalid Entry";
        }

        System.out.println(result);

        scan.close();


    }
}
