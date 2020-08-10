package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, -4, -50};
        for (int i = 0; i <= arr.length - 1; i++) { // i is the index number
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.println("===========================================");

        // for(DataType each: Collection of Data){
   //    }

        for(int each: arr){  // each represents the elements
            System.out.print(each + " ");
        }

        // each: represents every single elements in collection
        // dataType: MUST match with Array's dataType














    }
}
