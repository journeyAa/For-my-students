package repl.itAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodWithArrays_getDup {
    public static void main(String[] args) {
        String[] r = {"1", "2", "aa", "1", "aa"};


    }

    public static int getDup(String[] r) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(r));
        System.out.println(list);

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {
            if (Collections.frequency(list, each) != 1) {
                result.add(each);
            }
        }
        return result.size();
    }
}

