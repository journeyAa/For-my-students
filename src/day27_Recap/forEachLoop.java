package day27_Recap;

import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================================================");

        // when we dont need to prpvide or need index
        for (int i = arr.length-1; i>= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("========================================");


        for(int each: arr){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==================================================");

        int[] scores = {10,20,30,40,50,60,80,90,100,110,99};
        int countDivis3 = 0;
        for (int each: scores){
            if(each%3!=0){
                continue;
            }
            countDivis3++;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(countDivis3);

        System.out.println();
        System.out.println("==============================================================================");

        String[] names = {"AB", "ABC", "A", "ABCD"};
        for (String each: names) {
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("===================================================================================");

        int[] score = {80,50,98,100,45,76,43};
        int max = score[0];
        int min = score[0];
        for(int each: score){
            if(each>max){
                max = each;
            }
            if(each<min){
                min= each;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);














    }
}
