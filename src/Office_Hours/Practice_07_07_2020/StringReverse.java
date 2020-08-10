package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        String str = scan.nextLine();
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){ // i : 6 5 4 3 2 1 0

            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println("========================================================================");

        String result2 = "";
        int index = str.length()-1;

        while(index >= 0){

            result2 += str.charAt(index);
            index -= 1;
        }

        System.out.println(result2);

























    }
}
