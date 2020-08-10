package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        Integer[] arr1 = {1,2,3,4};

        for (int each : arr1){
            System.out.println(each);
        }

      //   double[] arr3 = {1,2,3,4,5,6};
        Double[] arr4 = {1.0, 2.5,3.2,101.5};

        for (Double each: arr4){
            System.out.println(each);
        }

        char[] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5));

        char ch = 75;
        Character ch2 = 75;
        System.out.println(ch2);


        String[] nums1 = {"12" ,"13","14","15"};
        double[] nums2 = new double[nums1.length];

        for (int i = 0; i < nums1.length-1 ; i++) {
            nums2[i] = Double.parseDouble(nums1[i]);

        }

        System.out.println(Arrays.toString(nums2));

















    }
}
