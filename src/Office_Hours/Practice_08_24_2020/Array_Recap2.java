package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;

public class Array_Recap2 {
    public static void main(String[] args) {

        int[] nums = {2,3,4,5,6,7,8};
        for (int each: nums){
           if(each%3!=0){
               continue;
            }
            System.out.println(each);

        }

        System.out.println("=======================================================================");

        String[] names = {"Mawlan", "Nijat", "Erfan", "Naz", "Mahmood"};
        for (String each: names){
            if(each.toLowerCase().contains("m")){
                System.out.println(each);
            }
        }
        System.out.println(Arrays.toString(names));

        System.out.println("==============================================================================");
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("==============================================================================");

        int[] a1 = {1,2,3, 9, 5};
        int[] a2 = {5,9, 1,2,3};
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));














    }
}
