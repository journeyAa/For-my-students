package day34_WrapperClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }

        }
        System.out.println("Odd nums are: "+oddList);
        System.out.println();
        System.out.println("Even nums are: "+evenList);

        System.out.println("=======================================================");

        ArrayList<String>groceryList = new ArrayList<>();
        groceryList.add("milk");
        groceryList.add("apples");
        groceryList.add("cheese");
        groceryList.add("yogurt");
        groceryList.add("banana");

        for (int i = groceryList.size()-1; i >= 0; i--) {
            System.out.print(groceryList.get(i) + " ");
        }
        System.out.println();

        for (String each: groceryList){
            System.out.print(each + " ");
        }


    }
}
