package repl.ItAssignments2;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {

        //             0  1 2   0  1 2    0 1 2    0 1 2
        int[][] arr = {{1,1,2}, {3,1,2}, {3,5,3}, {0,1,2}  };
        //               0         1        2        3

        // 4,6, 11, 3

        // the first for each is arr list
        // second for each loop is element
        int[] sumArr = new int[4];


        for (int[] eachArray: arr){
            int sum = 0;
           // System.out.println(Arrays.toString(eachArray));
            for (int eachElement: eachArray){
              //  System.out.print(eachElement);
              //  sumArr[i] = sum;
                sum+= eachElement;



            }
            System.out.println(sum);
            System.out.println();
        }

        /*
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3

  Then we should get the following array back:
{4,6,11,3}

 public static int[] rowSums(int[][] nums)
    {
      int[] newArr=new int[nums.length];
      for(int i=0; i<=nums.length-1;i++){
        int sum=0;
        for(int j=0; j<=nums[i].length-1; j++){
          sum+=nums[i][j];
          newArr[i]=sum;
        }
      }
        return newArr;
    }

         */












    }
}
