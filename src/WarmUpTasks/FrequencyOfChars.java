package WarmUpTasks;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBCDEFGGG";

        ArrayList<String> list = new ArrayList<>();

        for (String each: str.split("")){
            list.add(each);
        }
        System.out.println(list);

     /*   int count = Collections.frequency(list, "A");
        System.out.println("A occured " + count + " times");

      */
        String nonDup = Util.removeDup(str); // to avoid duplication

        for (String each : nonDup.split("")){
            int count = Collections.frequency(list,each);
            System.out.print(each + count);
        }















    }
}
