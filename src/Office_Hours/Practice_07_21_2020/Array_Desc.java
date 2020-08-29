package Office_Hours.Practice_07_21_2020;

import java.time.chrono.MinguoDate;
import java.util.Arrays;

public class Array_Desc {
    public static void main(String[] args) {

       int[] arr = {98,200,100,89,45,12,4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length];

        int index = 0;
        for (int i = arr.length-1; i >= 0  ; i--) {
            arr2[index] = arr[i];
            index++;
        }

        System.out.println(Arrays.toString(arr2));



















    }
}
