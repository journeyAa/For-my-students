package repl.itAssignments;

import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] arr = sentence.split(" ");

        System.out.println(Arrays.toString(arr));

        for (String each: arr){   // each element
            System.out.println(each);
        }




    }
}
