package repl.itAssignments;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PrintShortest {
    public static void main(String[] args) {

        String str = "volt, olive, fish, hot pursuit, warning, python, java, coffee, part";

        String[] arr = str.split(", ");

        System.out.println(Arrays.toString(arr));

        int shortestS = arr[0].length();

        for (String each: arr){
        //    int everyL = each.length();
            if(each.length()<shortestS){
                shortestS=each.length();
                System.out.println(shortestS);
            }

        }
        String expected = "";

        for (String each: arr){
            if(each.length()==shortestS){
                expected+=each + " ";
            }
            }
        System.out.println(expected);

       String[] arr1 = expected.split(" ");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));



    }
}
