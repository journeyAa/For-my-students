package Practice.Practice_ArRays;

import java.util.Arrays;

/*
int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
             task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */
public class day28_MultiD_lastTask {
    public static void main(String[] args) {

        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        /*
        task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */

        for (int i= arr2D.length-1; i>=0; i--) { // {9,10,11,12,13}//  {4,5,6,7,8} // {1,2,3}
           int[] arr1D = arr2D[i];
           for (int each: arr1D){
               System.out.print(each + " ");
            }
            System.out.println();

        }

        /*
         task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
         */

        System.out.println("222222222222222222222222222222222222222222222222222222");

        for (int i= 0; i<= arr2D.length-1; i++){
            int[] arr1D = arr2D[i];
            for (int j = arr1D.length-1; j>=0; j--) {
                System.out.print(arr1D[j] + " ");

            }
            System.out.println();

        }

        System.out.println();
        System.out.println("333333333333333333333333333333333333333333333333333333333");

        /*
        task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
                 int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

         */

        for (int i = arr2D.length-1; i >= 0; i--) {
            int[] arr1D = arr2D[i];
            for (int j = arr1D.length-1; j >= 0; j--) {
                System.out.print(arr1D[j] + " ");

            }
            System.out.println();

        }

        System.out.println();
        System.out.println("********************************************************");

        int[][][] arr3D = { {{1,2,3},{4,5}} , {{6,7,8}, {9,10}}   };
        System.out.println(Arrays.deepToString(arr3D));

        for (int i = 0; i <= arr3D.length-1 ; i++) {
            int[][] arr2DD = arr3D[i];
            for (int j = 0; j <= arr2DD.length-1 ; j++) {
                int[] arr1DD = arr2DD[j];
                for (int k = 0; k <= arr1DD.length-1; k++) {
                    System.out.print(arr1DD[k] + " ");

                }
                System.out.println();

            }

        }



























    }
}
