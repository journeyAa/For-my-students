package Warm_Ups;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

 */
public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item("cheese", 10.50, 2);
        Item item2 = new Item("yogurt", 4.50, 1);
        Item item3 = new Item("Doritos", 3.90, 3);
        Item item4 = new Item("Bananas", 0.5, 6);
        Item item5 = new Item("Udon", 5.90, 4);

        items.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost = 0;
        for (Item each: items){
            System.out.println(each.toString() + " : " + each.calCost());

            totalCost += each.calCost();

        }
        System.out.println("The total amount of money spent: $" + totalCost);

       // System.out.println(items);




    }
}
