package Practice.Practice_Constructor.day43;

import javafx.beans.property.SimpleObjectProperty;

import java.util.ArrayList;
import java.util.Arrays;

import static Practice.Practice_Constructor.day43.HumanResources.*;

public class BankOfAzerbeycan {

    /*
     3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
     */
    public static void main(String[] args) {

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(HumanResources.employee1);
        employeesList.add(HumanResources.employee3);
        employeesList.add(HumanResources.employee5);

        System.out.println(employeesList);

        employeesList.addAll(Arrays.asList(HumanResources.employee2, employee4));

        for (Employee eachEmployee: employeesList){
            System.out.println(eachEmployee.name+" : " + eachEmployee.gender+ " : $"+ eachEmployee.salary);
        }






    }
}
