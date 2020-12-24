package Office_Hours.practice_10_28_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDupForAmazon {
    public static void main(String[] args) {

        countDups("java is java language is useful java");






    }
/*
 * Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.

* -> input: "java is java language is useful java"
* output
* java : 3
* is : 2
* language : 1
* useful : 1
 */

    public static void countDups(String s){

        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        // converted String to ArrayList of Strings
        String checked = "";
        for (String eachWord: words){

            if (!checked.contains(eachWord)) {
                int frequencyOfEach = Collections.frequency(words, eachWord);  // ready method
                System.out.println(eachWord + ": " + frequencyOfEach);
                checked+= eachWord + " ";
            }


        }




    }

}
