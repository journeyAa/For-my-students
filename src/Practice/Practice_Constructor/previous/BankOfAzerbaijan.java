package Practice.Practice_Constructor.previous;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2, HumanResources.employee3, HumanResources.employee4, HumanResources.employee5));

        System.out.println(list.size());

        for (Employee each: list){
            System.out.println(each.name + " : " + each.salary);
        }













    }
}
