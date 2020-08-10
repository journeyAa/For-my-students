package Practice_ArRays;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class MultiD_Practice1 {
    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}, {12, 13, 14, 15}};

        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(Arrays.toString(nums[i]));

        }
        System.out.println(Arrays.deepToString(nums));

        String[] testers = {"A", "B", "C", "D"};
        String[] developers = {"a", "b", "c", "d"};

        String[][] devTeam = {testers, developers};
        System.out.println(Arrays.deepToString(devTeam));

        System.out.println("====================================================================");

        for (String[] each : devTeam) {
            for (String name : each) {
                System.out.println(name);
            }
            System.out.println(Arrays.toString(each));
        }

        System.out.println("******************************************************");

        int[][] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 135, 125}};
        // sout numbers that are divisible by 3 or 5

        for (int[] each : scores) {
            //  System.out.println(Arrays.toString(each));
            for (int score : each) {
                if (score % 3 == 0 || score % 5 == 0) {
                    System.out.println(score);
                }

            }
        }

        System.out.println("=========================================================");

        int[][] a1 = {{1,2},{3,4,5}};
        int[][] a2 = {{6,7},{8,9,10}};

        int[][][] arr3D = {{{1,2},{3,4,5}} , {{6,7},{8,9,10}}};
                 //             0                 1


















    }
}
