package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: " + s1 == s2);
        //                 "s1 == s2 is: abc" == "abc"
                        //    false

        //               if("s1 == s2 is: " + (s1 == s2)) == is true;

        int num = 1;
        while(num <= 100){
            num++;
            if(num%3==0){
                continue;
            }
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 10; i <= 50; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            sum += number;
        }
        System.out.println(sum);








    }
}
