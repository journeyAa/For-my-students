package day44_Constructor;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResources.*; // imports all static from human resource class

public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

     /*   list.addAll(Arrays.asList(employee1,employee3, employee5));
        // by using static imports we are able to import the static data, so can call them without class name

      /*  list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

       */

        list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2, HumanResources.employee3));

        System.out.println("Number of Employees: " + list.size());
        System.out.println("============================================================================");

        for (Employee each: list){
            System.out.println(each.name +  " : " + each.salary);
        }









    }
}
