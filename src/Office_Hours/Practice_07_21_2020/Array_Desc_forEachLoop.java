package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc_forEachLoop {
    public static void main(String[] args) {


        int[] arr = {98,200,100,89,45,12,4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length];

        int index = arr.length-1;
        for (int each: arr){        //4, 12, 45, 89, 98, 100, 200
            arr2[index] = each;
            index--;
        }
        System.out.println(Arrays.toString(arr2));


    }
}
