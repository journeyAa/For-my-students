package repl.itAssignments;

public class Methods_PrintUniqueNums {
    public static void main(String[] args) {
      /*
       Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output: 2   9   34
       */

        int[] arr1 = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNums(arr1);

        int[] arr2= {9,9,0,2,1,3,3,4,5,5,8,9};
        printUniqueNums(arr2);

    }
    public static void printUniqueNums(int[] arr){

        for (int j = 0; j <= arr.length-1 ; j++) {

            int num1 = arr[j];
            int count = 0;

            for (int i = 0; i <= arr.length-1; i++) {
                int each = arr[i];   // 2 5 5 6 ...
                if(each == num1){  // 2
                    count++;
                }

            }
            if(count==1){
                System.out.println(num1);
            }
        }
    }
}
