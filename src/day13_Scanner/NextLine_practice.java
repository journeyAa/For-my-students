package day13_Scanner;

import java.util.Scanner;

public class NextLine_practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: "); // 150 Enter

        int buildingNum = scan.nextInt(); //150
                scan.nextLine(); // takes off the "Enter"

        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println();

        scan.close();
    }
}
