package day19_SelfPractice;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        /*write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.next();
        String first = str.substring(0,1);
        String rest = str.substring(1,str.length());
        System.out.println(rest + first);

        char ch1 = str.charAt(0);
        System.out.println(rest +  ch1);









    }
}
