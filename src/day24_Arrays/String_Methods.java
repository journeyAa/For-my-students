package day24_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch = str.toCharArray();// apply this all the arrys in the future

        System.out.println(Arrays.toString(ch));


        System.out.println("===================================================================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // D , C, E, B , A
        char[] ch2 = str2.toCharArray(); // A , D , C , B,  E

        Arrays.sort(ch1); // A B C D E
        Arrays.sort(ch2); // A B C D E

        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1);

        System.out.println("=================================================================");

        String sentence = "I love Programming language";

        String[] words =  sentence.split(" "); // {"I" "Love" , "Programming", "language"
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >= 0 ; i--) {
            System.out.print(words[i] + " ");

        }
        System.out.println();

        System.out.println("=====================================================================");

        String s= "JAVA";
        String[] arr = s.split(""); // every single element is string
        System.out.println(Arrays.toString(arr));//Arrays.toString(arr); // in order to print the  string

        char[] c = s.toCharArray(); // every single element is char
        System.out.println(Arrays.toString(c));

        /* for each loop: aloop that is already interated. starting from index 0 till the end of data struecutre
        order is fixed
        we MUST have a daya strucure to use for each

         */

























    }
}
