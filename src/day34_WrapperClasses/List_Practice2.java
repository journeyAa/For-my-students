package day34_WrapperClasses;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(400);
        list.add(-9400);
        list.add(5);
        list.add(12);
        list.add(-5268);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer each: list){
            if(each>max){
                max = each;
            }
            if(each<min){
                min=each;
            }

        }
        System.out.println(max);
        System.out.println(min);















    }
}
