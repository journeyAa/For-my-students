package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String result = ""; // first time n, then a , then l

        for(int i = 0; i <= str.length()-1; i++){

            String s = "" + str.charAt(i); // n , a , l, a , n

            if(result.contains(s)){
                continue;
            }else{
                result += s;
            }
        }
        System.out.println(result);

       // if!(result.contains(s)){
        //    result += s
       // }else{
         //   continue;
     //   }
















    }
}
