package day60_Collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {


        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,3,4,1,4,9,7,8,8, null));  // does not keep the insertion order
        // does not accept duplicates
        System.out.println(s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,3,4,1,4,9,7,8,8, null));  // keeps the insertion order. does not accept duplicates
        System.out.println(s2);


        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(8,3,4,1,4,9,7,8,8)); // does not take null
        System.out.println(s3);

        String[] arr = {"A", "A", "D", "C", "A"};






    }
}
