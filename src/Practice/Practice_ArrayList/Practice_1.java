package Practice.Practice_ArrayList;

import java.util.ArrayList;

public class Practice_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(20);
        list.add(5,20);

        System.out.println(list);

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <= 100 ; i++) {
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }

        }
        System.out.println(oddList);
        System.out.println(evenList);

        System.out.println("==================================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("banana");
        groceryList.add("apples");
        groceryList.add("pears");
        groceryList.add("cheese");
        groceryList.add("peppers");

        System.out.println(groceryList);

        for (int i= 0 ; i<= groceryList.size()-1; i++){
            System.out.print( groceryList.get(i) + " ");
        }

        System.out.println("=============================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(15469);
        nums.add(-54689);
        nums.add(1452);
        nums.add(784);
        nums.add(4578321);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer each : nums){
            if(each > max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("the max num is this arrayList is " + max);
        System.out.println("the min num is this arrayList is " + min);





    }
}
