package day61_Maps;

import java.util.*;

public class Warm_up {
    // write a program that can remove the palindrome string from a list of String
    public static void main(String[] args) {

        ArrayList<String> pal = new ArrayList<>(Arrays.asList("kayak", "java", "interview","ana", "level"));

        Iterator<String> it = pal.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i= each.length()-1; i>= 0; i--){
                reverse+=each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(pal);


        System.out.println("==============================task2========================================");
        // write a program that can remove the even numbers from a set of Integer

        Set<Integer> nums = new LinkedHashSet<>(Arrays.asList(1,3,5,6,3,8,9,4,2,314,56,90,40,33,45,9,9));

        Iterator<Integer> i = nums.iterator();

        while (i.hasNext()){

            if(i.next() % 2==0){
                i.remove();
            }
        }

        System.out.println(nums);


        System.out.println("*********************************task 3*************************************");
        // // write a program that can remove the duplicated Integers from a List of Integer

        List<Integer> list = new ArrayList<>(Arrays.asList(23,23,45,67,67,89,4,5,3,2,7,9,23,2,7));


       LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

       list.clear();
       list.addAll(set);

        System.out.println(list);

        // why linked hashset? to keep the insertion order



















    }
}
