package day12_SwitchScanner;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class userInput_Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double num = scan.nextDouble();

        String result = (num % 2 == 0) ? num + " is Even number" : num + " is Odd number";

        System.out.println(result);



    }
}
