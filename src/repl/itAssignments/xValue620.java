package repl.itAssignments;

public class xValue620 {
    public static void main(String[] args) {

        /* write an expression using the conditional operator that compares the values of the variables
         x to 5 and results in :
         displayes x if x is greater than or equal to 5
         displayes -x if x is less than 5
         */

        int x = 10;
        String result = "";

        if(x >= 5){
            result = "x";
        }else{
            result = "-x";
        }
        System.out.println(result);

       int  result1 =  (x >= 5) ? x : -x;

        System.out.println(result1);

        /*In the happy valley school system, children are classified by age as follows:
        less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

         */
        int age = 8;
        String display ="";

        if(age < 2){
            display = "Display prompt: " + "ineligible";
        }else if(age == 2){
            display = "Display prompt: " + "toddler";
        }else if(age >= 3 && age <= 5){
            display = "Display prompt: " + "early childhood";
        }else if(age >= 6 && age <= 7){
            display = "Display prompt: " + "young reader";
        }else if(age >= 8 && age <= 10){
            display = "Display prompt: " + "elementary";
        }else if(age == 11 || age == 12){
            display = "Display prompt: " + "middle";
        }else if(age == 13){
            display = "Display prompt: " + "impossible";
        }else if(age >= 14 && age <= 16){
            display = "high school";
        }else if(age >= 17 && age <= 18){
            display = "Display prompt: " + "scholar";
        }else if(age > 18){
            display = "Display prompt: " + "ineligible";
        }

        System.out.println(display);

        int num = 81;
        String result2 = "";

        boolean evenNum = num % 2 == 0;
        boolean oddNum = !evenNum;

        if(evenNum){
            result2 = num + " is even";
        }else{
            result2 = num + " is odd";
        }

        String result3 = (evenNum) ? num + " is even" : num + " is odd";

        System.out.println(result3);

        System.out.println(result2);

        /*SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"*/

        int vehicleYear = 2020;
        String type = "";

        boolean recallV = vehicleYear >= 1995 && vehicleYear <= 1998 || vehicleYear >= 2001 && vehicleYear <= 2002
                || vehicleYear >= 2004 && vehicleYear <= 2006 || vehicleYear >= 2015 && vehicleYear <= 2017;

        if(recallV){
            type = "Your vehicle needs to be recalled!";
        }else{
            type = "Your vehicle is fine, enjoy!";
        }

        System.out.println(type);

        /*Write a program that will print out month names by receiving a number. Use ternary for conditions.*/

        int month = 12;
        String name= "";

        if(month >= 1 && month <= 12){
            if(month == 1){
                name = "January";
            }else if(month == 2){
                name = "February";
            }else if(month == 3){
                name = "March";
            }else if(month == 4){
                name = "April";
            }else if(month == 5){
                name = "May";
            }else if(month == 6){
                name = "June";
            }else if(month == 7){
                name = "July";
            }else if(month == 8){
                name = "August";
            }else if(month == 9){
                name = "September";
            }else if(month == 10){
                name = "October";
            }else if(month == 11){
                name = "November";
            }else{
                name = "December";
            }

        }else{
            name = "invalid number";
        }

        System.out.println(name);

//        String name2 = (name == 1) ? "January" : (name == 2) ? "February" :
//                (name == 3) ? "March" : (name == 4) ? "April" :
//                        (name == 5) ? "May" : (name == 6 ) ? "June" :
//                                (name == 7) ? "July" : (name == 8) ? "July" :
//                                        (name == 9) ? "September" : (name == 10) ? "October" :
//                                                (name == 11) ? "November" : "December";

        int day = 9;
        String dayName = "";

        if(day >= 1 && day <= 7){
            if(day == 1){
                dayName = "Monday";
            }else if(day == 2){
                dayName = "Tuesday";
            }else if(day == 3){
                dayName = "Wednesday";
            }else if(day == 4){
                dayName = "Thursday";
            }else if(day == 5){
                dayName = "Friday";
            }else if(day == 6){
                dayName = "Saturday";
            }else{
                dayName = "Sunday";
            }

        }else{
            dayName = "Wrong entry";
        }
        System.out.println(dayName);
//
//





    }
}
