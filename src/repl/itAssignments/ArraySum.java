package repl.itAssignments;

public class ArraySum {
    public static void main(String[] args) {
       int nums [] = {3,5,9,8,10} ;
       int sum = 0;
        for (int i = 0; i <= nums.length-1 ; i++) {
            sum += nums[i];

        }
        System.out.println(sum);
    }
}
