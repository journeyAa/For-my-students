package repl.ItAssignments2;

import java.util.Arrays;

public class SwitchElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int temp = 0;

        arr[0] = temp;
        temp = arr[arr.length-1];
        arr[arr.length-1] = temp;
        temp = arr[0];

        System.out.println(Arrays.toString(arr));



    }


}
