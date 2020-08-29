package Office_Hours.Practice_08_24_2020;
import  java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    public static void main(String[] args) {

        int[] arr1 = new int[5];

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = names.length-1; i >= 0 ; i--) {
            System.out.println("Enter a name");
            names[i] = scan.nextLine();

        }
        System.out.println(Arrays.toString(names));




















    }
}
