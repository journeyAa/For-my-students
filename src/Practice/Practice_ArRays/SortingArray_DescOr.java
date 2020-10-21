package Practice.Practice_ArRays;

import java.util.Arrays;

public class SortingArray_DescOr {
    public static void main(String[] args) {
        int[] arr = {1, 65, 9, 2, 3, 18, 5};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);// to sort out the array in ascending order
        System.out.println(Arrays.toString(arr));

  //      System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length]; // last index tot he first index


   /*
                i               k
            desc[0] = arr[arr.length-1]
            desc[1] = arr[arr.length-2]
             desc[2] = arr[arr.length-3]

    */
        int k = arr.length-1;
        for (int i = 0; i <= desc.length-1 ; i++) {
            desc[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(desc));




















    }
}
