package day60_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SameChar_OrNot {
    // write a program that can identify if two Strings are build out of same characters
    // write a program that can remove duplicates from array of String. return array
    public static void main(String[] args) {

        String str1 = "abcabc";
        String str2 = "cab";

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println(str1.equals(str2));


        String x1 = "cacacabb";
        String x2 = "bbaac";

        x1 = new HashSet<>( Arrays.asList(x1.split(""))).toString();
        x2 = new HashSet<>( Arrays.asList(x2.split(""))).toString();

        System.out.println(x1.equals(x2));


        String[] names = {"Aalia", "Ekbar", "Ekbar", "Bilal", "Bilal"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));

        // convert collection type to array
        names = set1.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

        System.out.println("==========================no temp value==============================");

        String[] name2 = {"Roman", "Roman", "Roman", "Nur", "Nur"};

        name2 = new LinkedHashSet<>(Arrays.asList(name2)).toArray(new String[0]);

        System.out.println(Arrays.toString(name2));

        Integer[] num = {1,1,3,2,1,9,7,5,3,2,6};

       num =  new HashSet<>(Arrays.asList(num)).toArray(new Integer[0]);
        System.out.println(Arrays.asList(num));












    }
}
