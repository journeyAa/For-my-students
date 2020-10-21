package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class String_UniqueRecall {
    public static void main(String[] args) {
        String str = "AABBCCDDEEFHIK";  // find the unique meaning it occured only once
        String expected = "";
        int count = 0;
        String unique = "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            String each = "" + str.charAt(i);
            if(!expected.contains(each)){
                expected+=each;
            }

        }
        System.out.println(expected);


        ArrayList<Character> list = new ArrayList<>();

        for (Character each: str.toCharArray()){
          list.add(each);


        }

        for (Character each: list){
            int fre =  Collections.frequency(list,each);
            if(fre==1){
                unique+=each;
            }
        }
        System.out.println(unique);




    }
}
