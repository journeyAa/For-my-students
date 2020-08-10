package repl.itAssignments;

public class intArray_findingDup {
    public static void main(String[] args) {

      int[] nums = {1, 1, 2, 3, 4, 3, 4}  ;




       for (int j = 0; j <= nums.length-1 ; j++) {
           int count = 0;

            for (int i = 0; i <= nums.length-1; i++) { // i = 1 , 1, 2..
                if(nums[i]==nums[j]){
                    count++;
                }

                }
                if(count==1){
                    System.out.println(nums[j]);
            }
       }










    }
}
