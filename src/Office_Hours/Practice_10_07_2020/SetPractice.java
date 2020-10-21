package Office_Hours.Practice_10_07_2020;

import java.lang.reflect.Array;
import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

//        String str = null;
//        System.out.println(str.toUpperCase());

        String[] names = {"Dawud", null, "Aslan", "Aslan", "Aslan", "Aslan"};


        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));
        System.out.println("hashSet = " + hashSet);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names));
        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names));












    }
}
