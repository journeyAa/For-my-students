package day09_IfStatement;

import java.sql.SQLOutput;

public class warmup2 {
    public static void main(String[] args) {
        /*1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.*/

       int angle1 = 60;
       int angle2 = 90;
       int angle3 = 30;
       int angleSum = (angle1 + angle2 + angle3);

       if(angleSum == 180) {
           System.out.println(" this is a ");
           System.out.println("\t\t\t      ^");
           System.out.println("\t\t\t    /   \\");
           System.out.println("\t\t\t   /     \\");
           System.out.println("\t\t\t  /       \\");
           System.out.println("\t\t\t /_________\\");
       } else{
           System.out.println("NOT a triangle shape");
       }



        /*Note: MUST use if&else statement
2. write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"*/

        char char1 = 70;
        char char2 = 'F';

        if(char1==char2){
            System.out.println("\"Same characters\"");
        } else{
            System.out.println("\"Different characters\"");
        }






 /*3. SDET Motors Inc. is recalling all vehicles from model years
 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
 wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
*/
        int modelYear = 2004;

        if((modelYear >=1995 && modelYear <= 1998) || (modelYear >=2001 &&modelYear <=2002)
                || (modelYear >= 2004 && modelYear <= 2006) ||
                (modelYear >= 2015 && modelYear <= 2017)) {
            System.out.println("The vehicle is eligible to be recalled");
        }
    }
}
