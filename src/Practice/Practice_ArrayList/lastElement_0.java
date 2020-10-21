package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class lastElement_0 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> listNew = new ArrayList<>();
        for (Integer each: list){
            listNew.add(each);
        }
        listNew.set(listNew.size()-1, 0);

        System.out.println(listNew);
        System.out.println("=====================================================================");
        // write a prgram that can multiply each odd num by 2

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20 ; i++) {
            list2.add(i);

        }
        System.out.println(list2);

        for (int i = 0; i <= list2.size()-1 ; i++) {
            Integer each = list2.get(i);
            if(each%2==1){
                list2.set(i, list2.get(i)*2);
            }else{
                list2.set(i, i*3);
            }

        }
        System.out.println(list2);













    }
}
