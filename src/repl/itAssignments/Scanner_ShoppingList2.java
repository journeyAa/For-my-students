package repl.itAssignments;

import java.util.Scanner;

public class Scanner_ShoppingList2 {
    public static void main(String[] args) {

        String item1 = "";
        String item2 = "";
        String item3 = "";
        String report = "";

        double price1 = 0;
        double price2 = 0;
        double price3 = 0;
        double totalPrice = 0;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        price1 = price1 * count1;
        price2 = price2 * count2;
        price3 = price3 * count3;

        if(count2 != 0 && count3 != 0){
            totalPrice = price1 + price2 + price3;
            report = "Item1: " + item1 + " Price: " + price1 + " Item2: " + item2 + " Price: " + price2
                    + ", Item3: " + item3 + " Price: " + price3;
        }else if(count2 == 0) {
            totalPrice = price1 + price3;
            report = "Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price: " + price3;
        }else if(count3 == 0) {
            totalPrice = price1 + price2;
            report = "Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2;
        }

        System.out.println(report);

        System.out.println("Total price: " + totalPrice);




























    }
}
