package repl.itAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(4,-6,3,-8,0,4,3));










    }
   public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
       ArrayList<Integer> newArrayList = new ArrayList<>();
       int sum = 0;
       for (Integer each: nums){
           if(each>0){
               newArrayList.add(each);
               sum+=each;
           }
       }
       //System.out.println(newArrayList);

       newArrayList.add(sum);
       return newArrayList;


   }

   public static void timesTwo(ArrayList<Integer> nums){

       for (int i = 0; i <= nums.size()-1 ; i++) {
           nums.set(i ,nums.get(i)*2);

       }
   }
}
