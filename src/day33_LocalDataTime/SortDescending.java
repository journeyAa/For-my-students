package day33_LocalDataTime;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5};


        Arrays.sort(arr);  // 1 2 3 4 5


        int[] arr2 = new int[arr.length]; // 5,4,3,2,1

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1 ; i++) {
            arr2[i] = arr[k];
            k--;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("=============================================");



        int[] scores = {100,75,85,95,65,55};

        System.out.println(Arrays.toString(scores));

        scores = sortDesc(scores);


        System.out.println(Arrays.toString(scores));

        System.out.println("=============================================================");

        double[] n1 = {5.5, 6.5, 2.5, 3.5, 1.5, 0, 0.5};
        n1 =  sortDesc(n1);

        System.out.println( Arrays.toString(n1) );

    }
    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);  // 1 2 3 4 5

        int[] arr2 = new int[arr.length]; // 5,4,3,2,1

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1 ; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);  // 1 2 3 4 5

        double[] arr2 = new double[arr.length]; // 5,4,3,2,1

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1 ; i++) {
            arr2[i] = arr[k];
            k--;
        }

      return arr2;

    }
    public static char[] sortDesc(char[] arr) {
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }







}
