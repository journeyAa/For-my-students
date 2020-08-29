package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_ForLoop {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D' , 'E', 'F'};

        char[] combine2 = new char[a1.length + a2.length];

        int index = 0;
        for (int i = 0; i <= a1.length-1 ; i++) {
            combine2[index] = a1[i];
            index++;
        }

        for (int j = 0; j <= a2.length-1 ; j++) {
            combine2[index] = a2[j];
            index++;
        }

        System.out.println(Arrays.toString(combine2));







    }
}
