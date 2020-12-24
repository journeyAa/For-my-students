package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Aalia", "Kamil", "Muradil", "Ahmad", "Ahmad"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equals("Ahmad")){
                it.remove();
            }
        }
        System.out.println(names);















    }
}
