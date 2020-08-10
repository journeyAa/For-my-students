package Practice_ArRays;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        String[] shoppingList = new String[7];

        shoppingList[1] = "cheese";
        shoppingList[3] = "lamb";
        shoppingList[0] = "butter";
        shoppingList[5] = "sugar";
        shoppingList[2] = "banana";
        shoppingList[6] = "eggs";
        shoppingList[4] = "milk";

        System.out.println(Arrays.toString(shoppingList));

        for (int i = shoppingList.length-1; i >= 0; i--) {
            System.out.print(shoppingList[i] + " ");

        }

        String[] months = {"Jan", "Feb", "Mar","Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Enter a num between 1 to 12");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(months[n-1]);
























    }
}
