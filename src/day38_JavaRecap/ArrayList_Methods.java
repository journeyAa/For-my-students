package day38_JavaRecap;

import day35_ArrayList.Combine2Arrays_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        // remove, size, set, get, equals, contains, clear

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes" +
                "", "Toyota", "Tesla", "Infinity", "Lexux", "Tesla", "Tesla"));
        //                          0       1          2         3         4        5
        System.out.println(cars);

       // cars.retainAll(Arrays.asList("Tesla"));

        // cars.remove(3);
        cars.remove("Tesla");
        System.out.println(cars);

        cars.removeAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        cars.removeIf(p -> p.toLowerCase().contains("m"));
        System.out.println(cars);

        System.out.println("==============================================");

        ArrayList<String> grocery = new ArrayList<>();
        grocery.addAll(Arrays.asList("Egg" , "Milk" , "Mango" , "Cheese" , "Orange"));

        boolean r1 = grocery.contains("Pepsi");
        System.out.println(grocery);
        System.out.println(r1);

        boolean r2 = grocery.containsAll(Arrays.asList("Egg", "Milk"));
        System.out.println(r2);

        grocery.set(grocery.size()-1, "apple");

        System.out.println("Total number of items: " + grocery.size());

        grocery.set(grocery.indexOf("Mango"), "DishWasher");
        System.out.println(grocery);











    }
}
