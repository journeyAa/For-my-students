package repl.itAssignments;

import java.util.Arrays;

public class PrintFirst_lastChar {
    public static void main(String[] args) {
      String[] words = {"hello", "why", "by", "apple" , "note"};
      String str = "";

      for (String each: words){
          char first = each.charAt(0);
          char last = each.charAt(each.length()-1);
           str += "" + first+last+ " ";


      }
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));












    }
}
