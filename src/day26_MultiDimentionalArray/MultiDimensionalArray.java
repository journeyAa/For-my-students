package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B','C'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G' ,'H'};
//                         0    1      0   1     2     0    1    2
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F','G', 'H'}};
            //               0              1               2
//
        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(Arrays.toString(ch2D[2]));

        //h
        System.out.println(ch2D[2][2]);

        // c
        System.out.println(ch2D[1]);

        // G B
        System.out.println(ch2D[2][1] + " " + ch2D[0][1]);

        System.out.println("==============================================================================");

        // can use it for single dimensional array
        // int[] arr1D = {{1, 2,3 }};

        // 7, 8, 9 , 10
        int[][] nums = {{1, 2 , 3}, {4} ,{5,6}, {7,8,9,10} };
        System.out.println( Arrays.toString(nums[3]));
        System.out.println("===========================================");
        System.out.println(Arrays.toString(nums[0]));
        for (int i = 3; i >= 0 ; i--) {
            System.out.println(Arrays.toString(nums[i]));
        }

















    }
}
