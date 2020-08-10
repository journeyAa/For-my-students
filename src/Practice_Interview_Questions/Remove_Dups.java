package Practice_Interview_Questions;

import java.util.Scanner;

public class Remove_Dups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch = "" + str.charAt(i);     // a a b b c c d d
        //    if(!result.contains(ch)){
          //      result+=ch;

            if(result.contains(ch)){
                continue;

            }else{
                result+=ch;
            }

        }
        System.out.println(result);











    }
}
