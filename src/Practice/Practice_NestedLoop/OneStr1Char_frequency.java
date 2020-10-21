package Practice.Practice_NestedLoop;
//write a program that ask a user to enter one string and one char and then returns the frequency of str2 in str1
// ex: input = AABAAC--A -- output 4

import java.util.Scanner;

public class OneStr1Char_frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        char ch1 = scan.next().charAt(0);

        int count = 0;
        for (int i = 0; i <= 5 ; i++) {

         char ch2 =  str1.charAt(i);  // A A B A A C
            if(ch1==ch2){
               count+=1;
            }
        }
        System.out.println(count);
        System.out.println("==========================================================");
      /*  int index = 0;
        int count2 = 0;
        while (index<=str1.length()-1){
            char ch2 = str1.charAt(index);
            if(ch1==ch2){
                count2+=1;
            }

          index++;
        }


        System.out.println(count2);

       */










    }
}
