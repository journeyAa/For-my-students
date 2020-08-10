package day29_CustomMethods;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTest {
    public static void main(String[] args) {
    /*    wamrmup tasks:
        1. create a function that can print out the maximum number between two numbers
        2. create a function that can print out the array of integers in descending order
        3. create a function that can print out the combination of two integer arrays
        4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop


     */





    }
    public static void maxNumber(int num1, int num2){
        int max = 0;
        if(num1>num2){
            max = num1;
        }else if(num1<num2){
            max=num2;
        }
        System.out.println("the max number is: " + max);





    }

    public static void arrayDescOrder(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            int eachNum = arr[i];
            System.out.print(eachNum + " ");

        }
    }






}
