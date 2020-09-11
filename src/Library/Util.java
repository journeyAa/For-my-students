package Library;

import java.util.Arrays;

public class Util {

    // import.Library.Util;

    public static String removeDup(String str) {
        String nonDup = ""; //"ab"

        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        return nonDup;


    }
    // removes the dups and return the value string

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }
    // reverse the string and return value

    public static int frequency(String str, char ch) {// find the frequency char from String str
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
    // finds the frequency of char from string str and return it as int

    public static String uniques(String str) { // frequency of every character

        String uniques = "";
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }
    // return unique from the string

    public static String freequencyOfChars(String str) {
        String expectedResult = "";
        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each); //2
            expectedResult += "" + each + count1;
        }

        return expectedResult;
    }
    // returns the frequency of every single characters from a string

    public static String formatFullName(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        // convert first char to ipper case       // convert rest of the chars to lower

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        return fullName;


    }
    // formats full name


    public static int MaxNum(int[] nums) {
        int max = nums[0];
        for (int each : nums) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    // finds and return the max number from int array

    public static double MaxNum(double[] nums) {
        double max = nums[0];
        for (double each : nums) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static Integer maxNum(Integer[] arr){
        Integer max = arr[0];
        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static Double maxNum(Double[] arr){
        Double max = arr[0];
        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static int MinNum(int[] nums) {
        int min = nums[0];
        for (int each : nums) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    // finds and return the min number from int array
    public static double MinNum(double[] nums) {
        double min = nums[0];
        for (double each : nums) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static Integer MinNum(Integer[] nums) {
        Integer min = nums[0];
        for (Integer each : nums) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static Double MinNum(Double[] nums) {
        Double min = nums[0];
        for (Double each : nums) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;
        }
        return arr2;

    }
    // inserts the element to the array

    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it

    public static double[] sortDesc(double[] arr) {
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    // sorts double array in descending order and returns it

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
    // sorts char array in descending order and returns it

    public static String[] sortDesc(String[] arr) {
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    // sorts String array in descending order and returns it


    // when finding the bug:   screenshot:
    //        1. TakeScreenShot
    //        2. browser
    //        3. Save

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static void sleep(int seconds){

        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }
    // causes the current execution thread to sleep for given seconds








}





