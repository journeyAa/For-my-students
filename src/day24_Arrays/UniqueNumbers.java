package day24_Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,4,3,7,7,9,9,0};

     /*  // this only calulates the frrquency of num 1
        int num1 = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int each = arr[i];
            if(each == num1){
                count++;
            }
        }

      */

        for (int j = 0; j <= arr.length-1 ; j++) {
            // j: 0, 1, 2, 3, 4,
            int num1 = arr[j]; // 1, 1 2 3 3
            int count = 0;

            for (int i = 0; i <= arr.length-1; i++) {
                int each = arr[i];
                if(each == num1){
                    count++;
                }
            }

            if(count ==1){
                System.out.println(num1);

        }


        }












    }
}
