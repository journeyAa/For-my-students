package Practice_ArRays;
// write a program that can return the num of appearance of "java" and "python"
// anywhere in the sentence

import java.util.Arrays;

// ex: I love Java, Python is cool.  output: 1 java 1 Python
public class NumOfAppearance {
    public static void main(String[] args) {

        String sentence = "I love java, Python is cool though, still I will learn python after I learn java";
        sentence = sentence.toLowerCase();

        String[] arr =  sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        int countJava =0;
        int countPython =0;

        for (String each: arr){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPython);


















    }
}
