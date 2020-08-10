package repl.itAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class DivingArrays {
    public static void main(String[] args) {
        float[] score = new float[7];
        float total = 0;
        Scanner input = new Scanner(System.in);
        float sum =0;

     /*   Arrays.sort(score);
        for (int i = 1; i < 7; i++) {
            float each = score[i];
            total+=each;
        }

      */
        for (int i = 0; i < 7 ; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = input.nextFloat();
            sum+=score[i];
        }

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();


       // System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        sum = sum - score[0] - score[6];
        total = sum*difficulty*6/10;


        System.out.printf("Total: %.2f", total);











    }
}
