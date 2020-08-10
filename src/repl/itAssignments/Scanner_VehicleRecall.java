package repl.itAssignments;

import java.util.Scanner;

public class Scanner_VehicleRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vehicleYear = 0;

        System.out.println("Enter your vehicle year:");
        vehicleYear = input.nextInt();

        boolean vehicleRecall = (vehicleYear >= 1995 && vehicleYear <= 1998 ||
                vehicleYear >= 2001 && vehicleYear <= 2002 || vehicleYear >= 2004 &&
                vehicleYear <= 2006 || vehicleYear >= 2015 && vehicleYear <= 2017);

        if(vehicleRecall){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy! ");
        }
    }
}
