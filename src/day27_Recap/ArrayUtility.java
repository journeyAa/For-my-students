package day27_Recap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
      /*
      sort()
      toString()
      equals
       */

        String[] names = {"Odina", "Lillia", "Berk", "Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score = {80,50,98,100,45,76,43};
        Arrays.sort(score);

        System.out.println(Arrays.toString(score));

        System.out.println();

        System.out.println("Maximum num: " + score[score.length-1]);
        System.out.println("Minimum num: " + score[0]);

        System.out.println();
        System.out.println("=============================================================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(Arrays.equals(s1,s2));

        String[] s3 = {"C", "A", "B"};

        System.out.println(Arrays.equals(s1,s3));

        Arrays.sort(s3);

        System.out.println(Arrays.equals(s1,s3));

        String w1 = Arrays.toString(s3);

        System.out.println(Arrays.toString(s3));
















    }
}
