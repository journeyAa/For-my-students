package Practice.Practice_ArRays;

import java.util.Arrays;

// write a program that can combine two arrays of integers and then print out the maximum number
public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int size = arr1.length + arr2.length;

        int[] arr = new int[size];

        System.out.println(Arrays.toString(arr));

        int index =0;
        for (int each: arr1){
            arr[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr));

        for (int each : arr2){
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int each: arr){
            if(each>max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }


        System.out.println(min);
        System.out.println(max);














    }
}
