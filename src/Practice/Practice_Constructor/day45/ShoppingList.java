package Practice.Practice_Constructor.day45;

import Office_Hours.Practice_08_12_2020.Arraylist_ShortQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        Item cheese = new Item("cheese", 2.5, 2);
        Item yogurt = new Item("yogurt", 6, 1);
        Item tuna = new Item("tuna", 2, 5);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(cheese);
        listOfItems.addAll(Arrays.asList(yogurt, tuna));

        for (Item eachItem: listOfItems){
            System.out.println(eachItem + ": $" + eachItem.unitPrice + " .total cost: " + eachItem.totalCost());
        }






    }
}
