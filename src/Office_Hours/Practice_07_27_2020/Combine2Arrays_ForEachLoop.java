package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_ForEachLoop {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D' , 'E', 'F'};

        char[] combine2 = new char[a1.length + a2.length];

        int index = 0;
        for (char each: a1){
            combine2[index] = each;
            index++;
        }
        for (char each: a2){
            combine2[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(combine2));

















    }
}
