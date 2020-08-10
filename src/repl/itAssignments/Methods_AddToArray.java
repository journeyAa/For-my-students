package repl.itAssignments;

import java.util.Arrays;

public class Methods_AddToArray {
    public static void main(String[] args) {













    }
    public static void add_to_r(int[] r, int n){

        int index = 0;

        int[] new_r = new int[r.length+1];
        for (int each: r){ // 1 5 77 8
            new_r[index] = each;
            index++;
        }

        new_r[index] = n;

        for (int each : new_r){
            System.out.println(each);
        }




    }
}
