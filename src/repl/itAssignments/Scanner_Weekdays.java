package repl.itAssignments;

import java.util.Scanner;

public class Scanner_Weekdays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");

        int day = scan.nextInt();

        String result = "";

        switch (day){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Wrong entry";
                break;
        }
        System.out.println(result);




    }
}
