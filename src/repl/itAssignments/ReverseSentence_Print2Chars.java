package repl.itAssignments;

import java.util.Arrays;

public class ReverseSentence_Print2Chars {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String[] sentence1 = sentence.split(" ");
        for (int i = sentence1.length - 1; i >= 0; i--) {
            System.out.println(sentence1[i]);
        }


       String[] words = {"hello", "why", "by", "apple" , "note"};
        String expected = "";
        for (String each: words){
            char ch1 = each.charAt(0);
            char ch2 = each.charAt(each.length()-1);
           expected+= ""+ ch1 + ch2 + " ";
        }
        System.out.println(expected);
        String[] expectedArr = expected.split(" ");
        System.out.println(Arrays.toString(expectedArr));













    }
}
