package day47_Encapsulation;

import day42_Static.CapitalOne;
import repl.itAssignments.Calc;

public class EmployeeObject {
    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("John", 30, "QA");

        employee1.setID(123);
        employee1.setAddress("Virginia");
        employee1.setSalary(10000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);






    }
}
