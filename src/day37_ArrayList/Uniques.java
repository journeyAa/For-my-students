package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
      String str = "AABCCDDEF";

     //   ArrayList<Character> list = new ArrayList<>();

     //   for (char each : str.toCharArray()){
     //       list.add(each);
    //    }

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);


// this method help find only the frequency of A, and to find all, we need loop
   /*     int count = Collections.frequency(list,"A");
        if(count==1){
            System.out.println("A");
        }

    */
        String uniques = "";


        for (String each: list){
            int count = Collections.frequency(list, each);

            if(count==1){
                uniques+=each;
            }

        }

        System.out.println(uniques);





















    }
}
