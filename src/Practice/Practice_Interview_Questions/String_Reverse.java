package Practice.Practice_Interview_Questions;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String reverseStr = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
           // char ch = str.charAt(i);
           // reverseStr += "" + ch;
            reverseStr += str.charAt(i);

        }
        System.out.println(reverseStr);


        String result = "";
        int index = str.length()-1;
        while (index>=0){
            result+=str.charAt(index);
            index--;
        }
        System.out.println(result);















    }
}
