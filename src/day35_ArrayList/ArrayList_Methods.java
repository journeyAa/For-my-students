package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();

        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Cristina");
        earlyBirdList.add("Bilal");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Naz");

        earlyBirdList.set(2,"Aslan"); // it replaces the new one with the old one
        earlyBirdList.set(0,"Yasin");

        System.out.println(earlyBirdList);

        System.out.println("====================================================================");


        // remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println( list );

        list.remove(2);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(0);
        System.out.println(list.size());
        System.out.println("=====================================================");

        // remove (object)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println(list2);

        Integer a = 1;
        list2.remove(a);
        System.out.println(list2);

        System.out.println("==============================================================");

        ArrayList<String> list3 = new ArrayList<>();
                list3.add("Hamid");
                list3.add("Lilia");
                list3.add("Belent");
                list3.add("Flora");
                list3.add("Musa");
        System.out.println(list3);

         list3.remove("Belent");
        System.out.println(list3);

        Integer b = 2;
        list3.remove(b);
        System.out.println(list3);





    }
}
