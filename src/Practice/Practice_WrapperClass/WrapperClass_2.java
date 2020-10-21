package Practice.Practice_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClass_2 {
    public static void main(String[] args) {
//  1. write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5}
//            output: 5 4 3 2 1

       ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(10,20,30,40,50));
        for (int i = list.size()-1; i >= 0  ; i--) {
            System.out.print(list.get(i) + " ");

        }

        System.out.println();
        System.out.println("=======================================================");

//  2. write a program that can return the sum of all the digits from a string
//            ex:
//                input: "a1b2c3"
//                output: 6
//                    (1+2+3= 6)
//                input: "Today's date is 04/27/2020"
//                output: 17
//                    (0+4+2+7+2+0+2+0=17)
//            HINT: on ascii table, the characters between #48 ~ #57 are digits

        String input = "a1b2c3";
        int sum = 0;
        for (int i = 0; i<= input.length()-1 ; i++) {
            char each = input.charAt(i); // a 1 b 2 c 3
            if(each>= 48 && each<= 57){ // it is a digit here
               sum+= Integer.parseInt(""+ each); // convert char to string then digit

            }


        }
        System.out.println(sum);





    }
}
