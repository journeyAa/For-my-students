package Office_Hours.Practice_08_18_2020;

import Office_Hours.Practice_08_12_2020.Arraylist_ShortQuiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Git_Shortcut {
    public static <Arraylist> void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

        for (int i = 0; i <= list.size()-1; i++) {
            Integer each = list.get(i); // represents each number
            if(each%2 != 0){  // odd numbers multiply by 2
                list.set(i,each*2);
            }else{
                list.set(i,each*3);
            }

        }
        System.out.println(list);

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "England", "Canada","Australia", "Russia", "Canada"));

       // countries.removeIf(p->p.endsWith("a"));
        countries.removeIf(p->p.charAt(p.length()-1)=='a');

        System.out.println(countries);










    }
}
