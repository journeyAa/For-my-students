package Practice_Method_OverLoading;
import Library.Util;

import java.util.Arrays;
import java.util.Scanner;

public class fullName_Format {
    public static void main(String[] args) {

        System.out.println(nameFormat("alper", "BRAYN"));

        String firstName = "MiNAvaR";
        String lastName = "tOhTI";

       String fullName = Util.formatFullName(firstName,lastName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);

        String reverseName = Util.reverse(fullName);
        System.out.println("========================================================");


        System.out.println( calculator(10,'/', 2));
        System.out.println(calculator(10, '%', 2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("operator");
        char ch = scan.next().charAt(0);
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        double result = calculator(num1,ch,num2);
        System.out.println("the result is " + result);


        int[] arr = {10,20,30,40};
        int num = 50;
        System.out.println(Arrays.toString(addElement(arr, num)));












    }
    public static String nameFormat(String firstName, String lastName){

        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        String last = lastName.substring(0,1).toUpperCase() +  lastName.substring(1).toLowerCase();


        String fullName = first + " " + last;
        return fullName;





    }

    public static double calculator(double num1, char operator, double num2){
        double result = 0;
        switch(operator){
            case'+':
                result = num1 +num2;
                break;
            case'-':
                result = num1 - num2;
                break;
            case'*':
                result = num1*num2;
                break;
            case'/':
                result= num1/num2;
                break;
            case'%':
                result = num1%num2;
                break;
        }
        return result;

    }

    /*
        3. write a method that can add element to an array, the method accepts an array and and a number,
         then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}

     */
    public static int[] addElement(int[]arr, int num){
        int[] arr2 = new int[arr.length+1];

        arr2[arr2.length-1] = num;

        int index = 0;
        for (int each: arr){
            arr2[index]= each;
            index++;
        }
        return arr2;
    }



}
