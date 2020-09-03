package day45_Constructor;

import Warm_Ups.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Warm_Ups.Item("cheese", 10.50, 2);
        Item item2 = new Warm_Ups.Item("yogurt", 4.50, 1);
        Item item3 = new Warm_Ups.Item("Doritos", 3.90, 3);
        Item item4 = new Warm_Ups.Item("Bananas", 0.5, 6);
        Item item5 = new Item("Udon", 5.90, 4);

        items.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        System.out.println("Items: " + items.size());

        double totalCost = 0;

        for (Item each: items){
           totalCost += each.calCost();
        }

        System.out.println("Total Price: " + totalCost);

        System.out.println("=====================================================");

        Item[] itemArr = {item1, item2, item3, item4, item5};
        double totalCost2 = 0;

        for (int i = 0; i <= itemArr.length-1; i++) {
           totalCost2 += itemArr[i].calCost();
        }

        System.out.println(totalCost2);







    }
}
