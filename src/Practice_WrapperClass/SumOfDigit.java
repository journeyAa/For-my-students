package Practice_WrapperClass;

import java.util.ArrayList;

public class SumOfDigit {
    public static void main(String[] args) {
        String str = "a1b2c3";
        char[] ch = str.toCharArray();
        int sum = 0;

        for (char each : ch){
            if(Character.isDigit(each)){
               sum+= Integer.parseInt("" + each);
            }
        }

        System.out.println(sum);

        System.out.println("========================================================");

// 3. write a program that can combine two String arrays into one arrayList
//            ex:
//                arr1 = {"A", "B", "C"};
//                arr2 = {"D", "E", "F", "G"};
//                list ==> {"A", "B", "C", "D", "E", "F", "G"}

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr1){
            list.add(each);
        }

        for (String each : arr2){
            list.add(each);
        }

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(3);

        list1.remove(1);

        System.out.println(list1);

        Integer a = 6;

       boolean r1 = list1.remove(a);

        System.out.println(list1);

        System.out.println(r1);




















    }

}
