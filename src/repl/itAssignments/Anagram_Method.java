package repl.itAssignments;

import java.util.Arrays;

public class Anagram_Method {
    public static void main(String[] args) {

        String word1 = "earth";
        String word2 = "heart";

        System.out.println( isAnagram(word1, word2));

    }
    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        boolean isAnagram = true;

        String[] arr1 = word1.toLowerCase().replaceAll(" ", "").split("");
        String[] arr2 = word2.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.equals(arr1, arr2)){
            isAnagram=true;
        }else{
            isAnagram=false;
        }
        return isAnagram;
    }
}
