package repl.itAssignments;

import java.util.Scanner;

public class StringMethod_middleOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        int wordLength = word.length();

        if (wordLength % 2 != 0) {
            if (wordLength >= 3) {
                int middleIndexNumber = wordLength / 2;
                char ch1 = word.charAt(middleIndexNumber);
                System.out.println(ch1);
            } else if (wordLength == 0) {
                word = word.concat(word).concat(word);
            }


//            }else if(wordLength %2 ==0){
//            if(wordLength >= 4){
//                int middleIndexNumber = wordLength
//            }
//        }


            String word1 = "Java";
            String word2 = "html";
            word1 = word1.concat(word2).concat(word2).concat(word1);


        }
    }
}