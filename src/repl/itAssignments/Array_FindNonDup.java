package repl.itAssignments;

import java.util.Arrays;

public class Array_FindNonDup {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int each: nums){
                if(each==nums[i]){
                    count++;
                }
        }
            if(count==1){
                    System.out.println(nums[i]);
            }


        }














    }
}
