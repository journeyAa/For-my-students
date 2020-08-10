package repl.itAssignments;

import java.util.Arrays;

public class Method_splitPersonInfo {
    public static void main(String[] args) {
        String s = "person(\"jon,doe,30\")";
        person(s);






    }
    public static void person(String info){


        String[] arr = info.split(",");

       // System.out.println(Arrays.toString(arr));

        System.out.print("person name: " + arr[0].substring(arr[0].indexOf("\"")+1));
        System.out.print(" last name: " + arr[1]);
        System.out.print(" age: " + arr[2].substring(0,2));

    }
}
