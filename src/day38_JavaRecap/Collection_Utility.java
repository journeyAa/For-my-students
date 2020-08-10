package day38_JavaRecap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day35_ArrayList.Combine2Arrays_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    /*
    Collection class :
    sort , swap, frequency, max, min, replaceAll
     */
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'A','D', 'E'));

        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Iman", "Mohammad"));
        System.out.println(students);

        Collections.swap(students, 1, 3 );
        Collections.swap(students, 0, 2);
        System.out.println(students);


        ArrayList<String> items = new ArrayList<>();
        items.addAll( Arrays.asList("coffe", "battery", "eggs", "battery", "milk", "battery"));

        int count = Collections.frequency(items,"battery");

        System.out.println(count);



        ArrayList<String> unique = new ArrayList<>();
        for (String each : items){
            int i = Collections.frequency(items, each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        ArrayList<String> uniques = new ArrayList<>();
        uniques.addAll(items);
        uniques.removeIf(p-> Collections.frequency(uniques, p)>1);
        System.out.println(uniques);


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,100,500,123456,10,10,-78,-7894));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max is " + max);
        System.out.println("min is " + min);

        Collections.replaceAll(list, 10, 20);



    }
}
