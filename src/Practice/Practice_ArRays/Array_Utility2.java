package Practice.Practice_ArRays;

import java.util.Arrays;

public class Array_Utility2 {
    public static void main(String[] args) {
       String str = "ABCD";
       char[] ch = str.toCharArray();

        System.out.println(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println("=====================================================");

        String[] str1 ={ "D", "E","B", "C", "A"};
        String[] str2 = {"A","B", "C","D","E"};
        Arrays.sort(str1);
        System.out.println(Arrays.equals(str1,str2));

        String sentence = "I love programing language";
        String[] words = sentence.split(" "); // {I, love, programing, language}
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1 ; i>= 0; i--) {
            System.out.print(words[i]+ " ");
        }
        System.out.println();

        System.out.println("=======================================================================");
        String s = "JAVA";
        String[] arrS = s.split("");
        System.out.println(Arrays.toString(arrS));

        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));

























    }
}
