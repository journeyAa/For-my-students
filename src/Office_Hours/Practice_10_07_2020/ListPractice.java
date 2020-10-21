package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<String> list = new Vector<>();
        list.addAll(Arrays.asList("Nurbiya", "Emina", "Dawud", "Emina", "Emina"));

        System.out.println(list);

        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        System.out.println(stack);


        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
