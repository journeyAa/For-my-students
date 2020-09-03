package repl.ItAssignments2;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {

        //             0  1 2   0  1 2    0 1 2    0 1 2
        int[][] arr = {{1,1,2}, {3,1,2}, {3,5,3}, {0,1,2}  };
        //               0         1        2        3

        // the first for each is arr list
        // second for each loop is element

        int sum = 0;

        for (int[] each: arr){
            for (int nums : each){
                System.out.print(nums + " ");
            //    sum +=nums;
              //  System.out.println(sum);
            }
          //  System.out.println(Arrays.toString(each));
            System.out.println();
        }












    }
}
