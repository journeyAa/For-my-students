package day60_Collection;

import repl.ItAssignments2.Telephone;

import java.util.*;

public class SetPractice {
    // write a program that removes the duplicates
    public static void main(String[] args) {

        String str = "eeFFaaDDabbccdd";
        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));

        Set<String> s1 = new TreeSet<>();
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1);

        System.out.println("===================================");
        String s2 = "zzzzyyxx";
        s2 = new LinkedHashSet<>(Arrays.asList(s2.split(""))).toString();
        s2= s2.replace("[", "").replace(", ", "").replace("]", "");
        System.out.println(s2);






    }
}
