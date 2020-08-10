package day28_Recap;

import java.util.Arrays;

/* int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                8 7 6 5 4
               3 12 11 10 9
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1


 */
public class MultiD_Array_Pracice2 {
    public static void main(String[] args) {
        //                 0 1 2      0 1 2 3 4      0 1  2  3  4
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //                  0            1                2

        for (int i =arr2D.length-1 ; i>= 0 ; i--) {
            int[] arr1D = arr2D[i];
            for (int each : arr1D){
                System.out.print(each + " ");
            }
            System.out.println();

        }




















    }
}
