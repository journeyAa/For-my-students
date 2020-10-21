package Practice.Practice_ArRays;

import java.util.Arrays;
import java.util.Scanner;

public class day27_Practice {
    public static void main(String[] args) {

        String[] names = {"Bahar", "Dildar", "Ardil" , "Bilal", "Gulsum", "Alim"};
        for (int i =names.length-1; i >=0 ; i--) {
            if(names[i].startsWith("A")){
                continue;
            }


            System.out.println(names[i]);
        }


        int[] name = new int[5];

        name[3] = 25;
        name[0] = 100;
        name[3] = 300;
        System.out.println(Arrays.toString(name));

        System.out.println("=====================================================");
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            numbers[i] = num;


        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("=========================================================");

        System.out.println("How many items do you want to buy");
        String[] shoppingList = new String[scan.nextInt()];

        for (int i = 0; i <= shoppingList.length-1; i++) {
            System.out.println("Enter items you want to buy");
            String items = scan.next();
            shoppingList[i] = items;

        }
        System.out.println(Arrays.toString(shoppingList));






    }
}
