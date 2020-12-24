package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterable {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,2,3,7,8,4,6,8,5,4,7));

     //   list1.removeIf(p-> p<5); // iterator done implicitly

        Iterator<Integer> it = list1.iterator();

        while (it.hasNext()){
            if(it.next() <5 ){
                it.remove();
            }
        }

        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,4,7,2,5,6,7,2));

        for (Iterator<Integer> i = list2.iterator(); i.hasNext(); ){
            if(i.next() < 5){
                i.remove();
            }
        }

        System.out.println(list2);











    }
}