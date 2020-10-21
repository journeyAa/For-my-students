package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        ArrayList<Boolean> list = new ArrayList<>();
        list.addAll(Arrays.asList(true, false, false));

        ArrayList<Boolean> repeat = new ArrayList<>();

        repeat.addAll(list);
        repeat.addAll(list);

        System.out.println(repeat);







    }
    public static String search(ArrayList<String> list, String target){

        for (String each : list){
            if(list.contains(target)){
                return each;
            }
        }
        return "search failed";


    }
    public static void repeatAl (ArrayList<Boolean> list){
        ArrayList<Boolean> copy = new ArrayList<>();
        for (int i = 0; i <= (list.size()-1)*2 ; i++) {
            copy.add(list.get(i));

        }
    }

}
