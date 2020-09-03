package repl.ItAssignments2;

import java.util.Arrays;

public class SwitchElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(do_switch(arr)));

    }

    public static int[] do_switch(int[] i){

        int[] afterSwitch = new int[i.length];

        int index = 0;

        for (int j = i.length-1; j >= 0; j--) {
            afterSwitch[index] = i[j];
            index++;
        }

        return afterSwitch;



    }
}
