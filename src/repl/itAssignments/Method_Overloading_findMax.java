package repl.itAssignments;
import java.util.ArrayList;
public class Method_Overloading_findMax {
    public static void main(String[] args) {

        String line = "foo bar";
        boolean isError = line.startsWith("error");

        System.out.println(isError);


    }

    public static void findMax(int[] arr) {



    }

    public static void findMax(double[] arr){


    }

    public static String extractNum(String s){
        String sNew = "";
        for (int i = 0; i <= s.length()-1 ; i++) {
            char ch = s.charAt(i);    // a a ! ,
            if(ch >= 48 && ch <=57 ){ // just the digits
                sNew+= "" + ch;

            }
        }
       return sNew;

    }

    public static boolean isError(String line){

        boolean isError = line.startsWith("error");

        return isError;
    }






}
