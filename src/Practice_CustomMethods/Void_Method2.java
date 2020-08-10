package Practice_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Void_Method2 {
    public static void main(String[] args) {
        int n1 = 2948;
        int n2 = -84674;
        maxNum(n1, n2);

        int[] arr1 = {5, 95,67,85,2,1};
        desArr(arr1);

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8};
        int[] c = new int[a.length + b.length];
        Combin2Arr(a,b,c);

        int n = 0;
        int nn = -40;
        int nnn = 9;
        poNeZ(n);
        poNeZ(nn);
        poNeZ(nnn);

        System.out.println("======================================");

        int[] numbers = {50,2,10,-78,-69,0,};
        for (int each: numbers){
            poNeZ(each);
        }





    }
   //  1. create a function that can print out the maximum number between two numbers
    public static void maxNum(int num1, int num2){
        if(num1==num2){
            System.out.println("equal");
            return;
        }
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }

    // 2. create a function that can print out the array of integers in descending order
    public static void desArr(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    //  3. create a function that can print out the combination of two integer arrays
    public static void Combin2Arr(int[]arr1, int[]arr2, int[]arr3){
        int index = 0;
        for (int i = 0; i <= arr1.length-1 ; i++) {
            arr3[index] = arr1[i];
            index++;
        }
        for (int i= 0; i<= arr2.length-1; i++){
            arr3[index] = arr2[i];
            index++;
        }
        System.out.println(Arrays.toString(arr3));



    }

    // 4.
    //        step1: create a function that can check if the given integer is positive, negative or zero
    //        step2: Use the above method to  write a program that can check every single elements of an array of Integers
    //        MUST use for each loop
    public static void poNeZ (int num){
        if(num>0){
            System.out.println("positve");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }


    }






}

