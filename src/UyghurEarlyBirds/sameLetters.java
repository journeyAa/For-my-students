package UyghurEarlyBirds;

import java.util.Arrays;

public class sameLetters {
    public static void main(String[] args) {
        String st1 = "abc";
        String st2 = "bac";

        System.out.println("sameString(st1,st2) = " + sameString(st1, st2));


    }




    public static boolean sameString(String str1, String str2){
        // str1 = "abc"
        // str 2 = "cba"

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1="";
        String s2 ="";

        for (char each: ch1){
            s1+= each;
        }

        for(char each: ch2){
            s2+=each;
        }

        return s1.equals(s2);




    }


}
