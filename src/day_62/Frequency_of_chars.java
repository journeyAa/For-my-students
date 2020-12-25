package day_62;

import java.util.*;

public class Frequency_of_chars {
    /*
     1. Write a program that stores the the character and frequency of each character from a String in to a Map

        Ex:
            str = "aaabbbccb"
            output:
                {a=3, b=4, c=2}

     */

    public static void main(String[] args) {

        String str = "aaabbbccb";
        Map<String, Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));
        for (String each: list){
            int frequency = Collections.frequency(list, each);
            map.put(each, frequency);

        }



    }
}
