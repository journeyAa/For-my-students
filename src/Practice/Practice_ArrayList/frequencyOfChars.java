package Practice.Practice_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBCDEEFK";
        ArrayList<String> list = new ArrayList<>();
        for (String each: str.split("")){
            list.add(each);


        }
        String nonDup = Util.removeDup(str); // to remove the duplication

        for (String each: nonDup.split("")){
            int count = Collections.frequency(list,each); // to see the frequency of each element

            System.out.print(each+count);
        }















    }
}
