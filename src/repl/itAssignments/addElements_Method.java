package repl.itAssignments;

import java.util.Arrays;

public class addElements_Method {
    public static void main(String[] args) {
     int[] arr = new int[5];



    }


    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] addElements = new int[ints1.length];

        for (int i = 0; i <= addElements.length - 1; i++) {
            addElements[i] = ints1[i] + ints2[i];

        }
        return addElements;
    }

    public static int[] populate(int[] r){
        int[] populate = new int[r.length];
        for (int i = 0; i <= r.length-1 ; i++) {
            populate[i] = i+1;
        }
        System.out.println(Arrays.toString(populate));
        return populate;
    }

}

