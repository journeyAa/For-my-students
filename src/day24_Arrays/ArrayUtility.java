package day24_Arrays;
import com.sun.media.jfxmediaimpl.HostUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayUtility {
    public static void main(String[] args) {

        int[] arr = {1,3,4};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"Muhtar", "Saim", "Kuzzat"};
        // in order to print array variables, we must convert to String first

        String nameS = Arrays.toString(names);
        System.out.println(nameS);

        System.out.println("=========================================================");

        int[] nums = {3,7,4,2,7,3,2,1};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // it sorts them in ascending order, 1,2,3,3,4,7
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number: " + nums[nums.length-1]);
        System.out.println("Minimum number: " + nums[0]);

        String students[] = {"Mehdi", "Simon", "Eli" ,"Mosa"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("==============================================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr, arr2);

        System.out.println(r1);

        int[] arr3 = {2,1,3};

        Arrays.sort(arr2);  // arr2 : 1 , 2 , 3
        Arrays.sort(arr3);  // arr3:  1,  2 , 3


        boolean r2 = Arrays.equals(arr2, arr3);
        System.out.println(r2);


























    }
}
