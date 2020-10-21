package Practice.Practice_Method_OverLoading;

import java.util.Arrays;

public class Descending_Order {
    public static void main(String[] args) {

        int[] arr4 = {50,2,41,78,2,14,4};
       Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println(Arrays.toString(sortDesc(arr4)));

        double[] arr1 = {1.2, 2.5, 100.3, 0.5, 1.1};
        System.out.println(Arrays.toString(sortDesc(arr1)));


    }
    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
        }

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }










}
