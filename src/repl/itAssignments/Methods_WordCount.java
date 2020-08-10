package repl.itAssignments;

import java.util.Arrays;

public class Methods_WordCount {
    public static void main(String[] args) {
       String str = "Java is fun and entertaining so that is why i study it";

        System.out.println( wordCount(str));










    }
    public static int wordCount(String words){
        String[] arr = words.split(" ");
      //  System.out.println(Arrays.toString(arr));

        return arr.length;


    }
}
