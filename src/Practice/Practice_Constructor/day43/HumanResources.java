package Practice.Practice_Constructor.day43;

public class HumanResources<employee1> {
    /*
     2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
     */

    static Employee  employee1;
    static Employee  employee2;
    static Employee  employee3;
    static Employee  employee4;
    static Employee  employee5;

    static {
        employee1=new Employee();
        employee2=new Employee();
        employee3=new Employee();
        employee4=new Employee();
        employee5=new Employee();

        employee1.setInfo("Ali", 123, 123, "SDET", 150000, 'M');
        employee2.setInfo("Bali", 134, 321, "SDET", 160000, 'M');
        employee3.setInfo("Nadim", 479, 454, "SDET", 170000, 'M');
        employee4.setInfo("Eli", 789, 741, "SDET", 180000, 'M');
        employee5.setInfo("Atilla", 648, 598, "SDET", 190000, 'M');
    }

}
