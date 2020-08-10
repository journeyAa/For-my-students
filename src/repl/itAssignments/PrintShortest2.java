package repl.itAssignments;

import java.util.Arrays;

public class PrintShortest2 {
    public static void main(String[] args) {
        String str = "volt, olive, fish, hot pursuit, warning, python, java, coffee, part";
        String[] word = str.split(", ");  // there are more than one shortest word
        // first find the first one then go through the array and find all th ewords with the same lengths

        String shortestWord = word[0];

        for(String each : word){
            if(each.length()<shortestWord.length()){
                shortestWord= each;
            }
        }
        int countOfShort = 0;
        for(String each : word){
            if(each.length()==shortestWord.length()){
             //   System.out.println(each);
               countOfShort++;
            }
        }
        String[] shortWordsArray = new String[countOfShort];
        int x = 0;
        for (String each : word){
            if(each.length()==shortestWord.length()){
                shortWordsArray[x] = each;
                x++;
            }
        }
        Arrays.sort(shortWordsArray);
        System.out.println(Arrays.toString(shortWordsArray));
       // System.out.println(countOfShort);



    }
}
