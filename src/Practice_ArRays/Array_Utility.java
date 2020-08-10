package Practice_ArRays;
import java.util.Arrays;
public class Array_Utility {
    public static void main(String[] args) {
        String[] arr = {"housechores", "baby food", "cleaning stuff"};
        System.out.println(Arrays.toString(arr) );

        int[] nums = {3,5,9,1,12,34,2};
        System.out.println(Arrays.toString(nums));
        System.out.println("======================================");

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i <= nums.length-1 ; i++) {
            System.out.print(nums[i] + " ");
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);






        System.out.println();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("the maximum number is " + nums[nums.length-1]);
        System.out.println("the minumun number is: " + nums[0]);

        System.out.println("===============================================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,1,3};
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));




    }
}
