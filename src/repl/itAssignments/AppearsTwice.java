package repl.itAssignments;

import java.util.Arrays;

public class AppearsTwice {
    public static void main(String[] args) {
        String sentence = "java is fun and i love java";
        String target = "java";

    }
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;

        for (String each : sentence.split(" ")){ // java is fun
            if(each.contains(target)){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }



    }

}
