package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();// String is a sequence of character
        String result = "";
       /* for (int i = str.length()-1; i >= 0 ; i--) {// max is the length - 1; and the min is 0
            result += "" + str.charAt(i);
        }
        System.out.println(result);*/

        // anything done with the for loop can be done with the while loop

        int i = str.length()-1;
        while(i>=0){
            result+= ""+str.charAt(i);
            i--;
        }
        System.out.println(result);



















    }
}
