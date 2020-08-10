package repl.itAssignments;
/*The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"*/

import java.util.Scanner;

public class ScannerVideoGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numOfCoupons = scan.nextInt();
        int numOfCandy = numOfCoupons/10;
        int numOfGumballs = (numOfCoupons % 10) / 3;

        if(numOfCoupons > 3) {

            System.out.println("Number of Cadies: " + numOfCandy);
            System.out.println("Number of Gumballs: " + numOfGumballs);
        }else {
            System.out.println("Not enough coupons");
        }
    }
}
