package Practice_Interview_Questions;

import java.util.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abcabcdeffg";
        String nonDup = "";

        String[] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));

        for (String each: arrStr){  // a b c a b c..........
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);














    }
}
