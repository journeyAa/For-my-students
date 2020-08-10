package day30_CustomMethods;

import java.util.Arrays;

/*
 1. create a function that can print out the maximum number between two numbers
        2. create a function that can print out the array of integers in descending order
        3. create a function that can print out the combination of two integer arrays
        4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements
         of an array of Integers
        MUST use for each loop
 */
public class WarmUP_Tasks<printDesc> {
    public static void main(String[] args) {
        maxNum(20,20);



    }






    int arr[] = {5,9,16,-78,26,549,-623,80,97};



    public static void maxNum(int num1, int num2){
        if(num1==num2){
            System.out.println("equal");
            return;
        }
        if(num1>=num2){
            System.out.println(num1 + " is the max");
        }else{
            System.out.println(num2 + " is the max");
        }
    }

    public static void printDesc(int[] arr){ // {22,50,65,13,5,9,13};
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0; i--) {
            System.out.println( arr[i] + " ");
        }
        System.out.println();


    }







}
