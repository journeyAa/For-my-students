package Practice_ArRays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        for (int each:arr) {
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("===========================================================");

        String[] classmates = {"Naz", "Erfan", "Cristina", "Miran", "lora"};
        Arrays.sort(classmates);
        for(String each: classmates){
            System.out.print(each + " ");
        }


















    }
}
