package repl.itAssignments;

import java.util.Scanner;

public class Scanner_VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int itemPrice, change;
        int quarters, dimes, nickels;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        boolean invalid1 = itemPrice > 100 || itemPrice < 25;
        boolean invalid2 = itemPrice % 5 != 0;

        if(invalid1 || invalid2){
            System.out.println("Invalid price!");
        }else{
            change = 100 - itemPrice;  // 40
            quarters = change / 25;    // 1
            int remainingAfterQuarter = change % 25; // 15
            dimes = remainingAfterQuarter / 10; // 1
            int  remainingCentsAfterDimes = remainingAfterQuarter % 10; // 10, 5 remaining
            nickels = remainingCentsAfterDimes/5; // 5
            System.out.println
                    ("Your change is " + quarters + " quarters, " + dimes + " dimes, and " +nickels + " nickels.");


        }
    }
}
