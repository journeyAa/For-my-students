package Practice.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,5,77,8,9,0));


        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer element : list){ // gets each of the element
           // Integer element = list.get(i);
            int count = 0;

            for (Integer each: list) {  // finds the frequency of the element
                if(each==element){
                    count++;
                }
            }
            if(count==1){  // if the element is uniqe
                uniques.add(element);
            }
        }

      //  for (int i = 0; i <= list.size()-1 ; i++) { // finding every single element

        System.out.println(uniques);


















    }
}
