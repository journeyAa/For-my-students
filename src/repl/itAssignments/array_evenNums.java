package repl.itAssignments;

public class array_evenNums {
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 2, 1, 2,  3,  4, 3, 4};
        int count = 0;

        for (int i = 0; i <= nums.length-1 ; i++) {
            int n = nums[i];
            if(n%2==0){
                count++;
                System.out.println(n);
            }

        }
        System.out.println(count);

        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        for (int i = 0; i <= arr.length-3; i++) {
            System.out.println(arr[i]+ " , " + arr[i+1] + " , " + arr[i+2]);

        }

            









    }
}
