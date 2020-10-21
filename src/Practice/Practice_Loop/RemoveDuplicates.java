package Practice.Practice_Loop;

import java.util.Scanner;

public class  RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String given = scan.next();
        // index        012345
        String result = "";

        for (int i = 0; i <= given.length()-1 ; i++) {
            //String s = "" + given.charAt(i);  // includes: a, a, b, c,c, d
            String s = given.substring(i, i+ 1);
            if(!result.contains(s)){// if the character included in the result, it wont be added
               result += s;        // only adds if it was not duplicated
        }

        }
        System.out.println(result);
        System.out.println("==============================================");

        for (int i = 0; i <= given.length()-1 ; i++) {
            String s = "" + given.charAt(i);
            if(result.contains(s)){// if the result continue the character, it will be skipped
                continue;
            }
            result+=s;

        }
        System.out.println(result);


















        }

    }

