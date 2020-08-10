package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Bahar");
        students.add("Sayim");
        students.add("Bajar");
        students.add("Naz");
        students.add("Aslan");
        students.add("Marry");


        boolean b1 = students.containsAll(Arrays.asList("Aslan", "Naz", "Bahar"));

        System.out.println(b1);

        System.out.println("==========================================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group

        group1.addAll( Arrays.asList("Muhtar", "Saim" ,"Bilal" , "Nadir"));
        // verify your mentor and one of yuour closets friends names are contained in the list
        boolean b2 = group1.containsAll( Arrays.asList("Naz", "Cristina"));
        System.out.println(b2);

        System.out.println("===============================================================");

        ArrayList<String> employeeName = new ArrayList<>();
                employeeName.addAll(Arrays.asList("Ahmed", "Muhtar", "Behran" , "Ahmed", "Beslan", "Ahmed"));

        System.out.println(employeeName);

        employeeName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);










    }
}
