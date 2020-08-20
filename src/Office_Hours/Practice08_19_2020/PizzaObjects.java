package Office_Hours.Practice08_19_2020;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForB20 = new ArrayList<>();

        for (int i = 1; i <= 400 ; i++) {
            Pizza myPizza = new Pizza();
            myPizza.setPizzaInfo("large", 5, 0);
            pizzaForB20.add(myPizza);
        }

        System.out.println("Total number of Pizza: " + pizzaForB20);
        double totalPrice = 0;

        for (Pizza each: pizzaForB20 ){
            totalPrice += each.calcPrice();
        }

        System.out.println("Total Price: " + totalPrice);

        System.out.println("==================================================================================");

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaInfo("medium", 5,2);

        Pizza pizza2 = new Pizza();
        pizza2.setPizzaInfo("small", 2, 4);

        System.out.println("Nadir's pizza is: $" + pizza1.calcPrice());
        System.out.println("Saim's pizza is: $" + pizza2.calcPrice());








    }
}
