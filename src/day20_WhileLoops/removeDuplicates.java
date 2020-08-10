package day20_WhileLoops;

import java.util.Scanner;

/*write a program that can remove the duplicates from any given String*/
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            //String s = "" + str.charAt(i);  // a a b b
            String s = str.substring(i, i+1);
            if (!result.contains(s)) {// if the character is already contained in result, it wont add to the result
                result += s;
            }


        }

        System.out.println(result);

        // if(result.contains(s) {
        // contine;
    //}



























    }
}
