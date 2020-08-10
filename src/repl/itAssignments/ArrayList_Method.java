package repl.itAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Method {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 6};
        mergR(a,b);

        String[] r1 = {"f","o","o"};
        String[] r2 = {" b","a","r"};

        ArrayList<String> combineRs = new ArrayList<>();

        for (String each: r1){
           combineRs.add(each);
        }
        for (String each: r2){
            combineRs.add(each);
        }
        System.out.println(combineRs);

        String result = "";
        for (String each: combineRs){
            result+=each;
        }
        System.out.println(result);


        System.out.println("=============================================");


    }

    public static int[] mergR(int[] a, int[] b) {
        int[] mergR = new int[a.length + b.length];

        int index = 0;
        for (int each : a) {
            mergR[index] = each;
            index++;
        }
        for (int each : b) {
            mergR[index] = each;
            index++;
        }
       return mergR;


    }
}