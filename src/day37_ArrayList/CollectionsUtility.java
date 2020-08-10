package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,30,10,50,-20,97,-6,500,-9000,123456));

        //max num
        Integer max = Collections.max(list);

        Integer min = Collections.min(list);

        System.out.println("The max num is " + max + " and the min is " + min);

        System.out.println("===========================================================");

        ArrayList<String> names = new ArrayList<>();
                names.addAll(Arrays.asList("Muhtar", "Bilal" ,"Saim","Muhtar", "Bryan"));

        System.out.println(names);

        //replaceAll
        Collections.replaceAll(names, "Muhtar", "Fatma");
        System.out.println(names);

























    }
}
