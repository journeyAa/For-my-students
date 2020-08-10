package day18_forLoop;

public class ReverseWord {
    public static void main(String[] args) {

        /*Write a program that reverse the following string
         * String str = "Java"
         * output : avaj
         * please provide two solutions
         *           first solution, you must use substring method
         *           second solution, you must use charAt method*/


        String str = "Python";

        String s1 = str.substring(0,1);
        String s2 = str.substring(1);
        String result = s2 + s1;
        System.out.println(result);






    }
}
