package repl.itAssignments;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {

        int size = 3;
        int[] num = new int[size];

        if(size<2){
            System.out.println(Arrays.toString(num));
        }else{
            int[] first2 = new int[2];
            first2[0] = num[0];
            first2[1] = num[1];
            System.out.println(Arrays.toString(first2));
        }



        int size1 = 2;
        int[] nums = new int[size];

        int[] nums1 = new int[nums.length*2];
        nums1[nums1.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums1));


















    }
}
