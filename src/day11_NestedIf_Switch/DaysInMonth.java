package day11_NestedIf_Switch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class DaysInMonth {
    public static void main(String[] args) {
        /*wrtie a program that can find the num of days in a month*/

        int month = 3;
        String result = "";

        boolean day28 = month == 2;
        boolean day30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month < 1 || month > 12;


        if (day28) {
            result = "28d days";
        } else if (day30) {
            result = "30 days";
        } else if (invalid) {
            result = "Invalid";
        } else {
            result = "31 days";
        }
        System.out.println("in this month, there are " + result);

        int num = 9;
        if(num++ == 10){
            System.out.println("hey" +num);
        }else {
            System.out.println(+num);

            int score = 0;
            if(score ==0){
                score += 50;

                if(score != 0){
                    score += 50;
                }

                System.out.println(score);

                int number = 10;
                if(--number > 10){
                    System.out.println("b" + +number);
                }else if (number ==9){
                    System.out.println("a" + +number);
                }

               int  x= 10;
               int  y = x++;
                System.out.println(y++ +" " + x++ + " " + y);
            }
        }


    }
}



