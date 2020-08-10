package repl.itAssignments;

import java.util.Arrays;

public class Array_ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));


        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];// 4,3,2,44...
            nums[i] = nums[nums.length-1 - i];// 0---55// 3====100
            nums[nums.length-1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums));












    }
}
