package Practice_ArRays;
// create an int array called numbers that has length of 100, and assign 1-100 to each index of array. then print
//out all the even numbers. must use continue statement;

import java.util.Arrays;

public class IntArray100 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i <= array.length-1 ; i++) {
            array[i] = i + 1;
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        for (int each: array){
            if(each%2==1){
                continue;

            }
            System.out.print(each + " ");














        }
    }














    }

