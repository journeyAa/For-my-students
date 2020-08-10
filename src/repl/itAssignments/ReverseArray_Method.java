package repl.itAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseArray_Method {
    public static void main(String[] args) {

        String[] arr = {"apples", "bananas", "pears"};

       // int[] nums = {5,7,6,2,79,214,1};
       // Arrays.sort(nums);
       // System.out.println(isSort(nums));



        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        int sum = 0;

        for (int i = 0; i <= ints.size()-1 ; i++) {
           sum += ints.get(i);

        }
        System.out.println(sum);

        System.out.println("=======================================");

        ArrayList<Double> nums =new ArrayList<>();
        nums.add(1.0);
        nums.add(2.0);
        nums.add(3.0);
        nums.add(4.0);
        nums.add(5.0);
        System.out.println(nums);

        nums.remove(0);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);

        System.out.println("===========================================");

        ArrayList<String> wordList1 = new ArrayList<>();
        wordList1.add("A");
        wordList1.add("B");
        wordList1.add("C");
        ArrayList<String> wordList2 = new ArrayList<>();
        wordList2.add("D");
        wordList2.add("E");

        ArrayList<String> combineAL = new ArrayList<>();


        for (String each: wordList1){
            combineAL.add(each);
        }
        for (String each: wordList2){
            combineAL.add(each);
        }













    }
    public static String[] reverse(String[] arr) {
        String[] reverse = new String[arr.length];

        int index = reverse.length-1;

        for (int i = 0; i <= arr.length-1; i++) {
            reverse[index] = arr[i];
            index--;

        }
        return reverse;
    }

    public static boolean isSort(int[] nums){
        boolean result = true;

        for (int i = 0; i <= nums.length-2; i++) {
            if(nums[i] > nums[i+1]){
                result=false;
            }else{
               result=true;
            }

        }
        //Arrays.sort(nums);
        return result;

    }



}
