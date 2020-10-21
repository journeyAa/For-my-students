package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeDup {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'C', 'F', 'D', 'D'));
        String result = "";

        ArrayList<Character> nonDup = new ArrayList<>();
        for (Character each: list){
            int count = Collections.frequency(nonDup,each);
            if(!nonDup.contains(each)){
                nonDup.add(each);


            }
        }
        System.out.println(nonDup);

        System.out.println(list.equals(nonDup));
        System.out.println(result);
















    }
}
