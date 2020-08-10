package day36_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        /*
        3.  write a program that can find the unique elements from an ArrayList of integers and stores into another
    list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
         */

        ArrayList<Integer> list = new ArrayList<>(); // {1,1,2,3,3}
                list.add(1);
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();  // 2

        for (int i = 0; i <= list.size()-1 ; i++) { // get each element
            Integer element = list.get(i);
            int count = 0;
            for (Integer each: list){  // find the frequency of each element
                if(each==element){
                    count++;
                }
            }
            if(count==1){
                uniques.add(element);
            }
        }


  /* this only get the first element and identifies if it is unique and to repeat the same step with the
  rest of the elements, we need another loop
        Integer element = list.get(0);
        int count = 0;
        for (Integer each: list){
            if(each==element){
                count++;
            }
        }
        if(count==1){
            uniques.add(element);
        }

   */

        for (Integer element: list){
            int count = 0;
            for (Integer each : list) {
                if(each==element){
                    count++;
                }
            }
            if(count==1){
                uniques.add(element);
            }
        }






    }
}
