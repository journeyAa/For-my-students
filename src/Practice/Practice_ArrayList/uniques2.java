package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class uniques2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,5,77,8,9,0));

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : list){
           int count = Collections.frequency(list,each);

           if(count==1){
               uniques.add(each);
           }
        }
        System.out.println(uniques);

        System.out.println("=================================================================");

      


    }
}
