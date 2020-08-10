package repl.itAssignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_remove {
    public static void main(String[] args) {

        ArrayList<Integer> r = new ArrayList<>();
        r.addAll(Arrays.asList(1,1,2,3,1,4));
        Integer n = 1;
        System.out.println(r);
       r.removeIf(p-> p.equals(n));

        System.out.println(r);

        ArrayList<String> wordList = new ArrayList<>();
        String targetWord = "hi";
        wordList.addAll(Arrays.asList("hi","hey","hi","yo"));











    }
    public static void removeAll(ArrayList wordList, String targetWord){
        wordList.removeIf(p-> p.equals(targetWord));
       // System.out.println(wordList);

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrL) {

        ArrayList<Integer> twoTimes = new ArrayList<>();

        for (Integer each: arrL){
            twoTimes.add(each);
            twoTimes.add(each);
        }
        return twoTimes;
    }

}
