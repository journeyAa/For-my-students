package repl.itAssignments;

import java.util.Scanner;

public class middleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordL = word.length();

        if(wordL % 2 != 0){
            if(wordL >= 3){
                System.out.println("" + word.charAt(wordL/2));
            }else if(wordL == 1){
                System.out.println(word.concat(word).concat(word));
            }
        }else if(wordL % 2 == 0){
            if(wordL >= 4){
                System.out.println("" + word.charAt(wordL/2 -1)+ "" + word.charAt(wordL/2));
            }else if(wordL == 2){
                System.out.println(word.concat(word));
            }
        }


    }
}
