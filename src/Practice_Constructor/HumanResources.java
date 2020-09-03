package Practice_Constructor;
// it is only for storing info
//can call it from className and info is set
public class HumanResources {

    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {

        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();


        employee1.setEmployeeInfo("Alim", 123,123456789,"QA", 100000, 'M');
        employee2.setEmployeeInfo("Ekrem", 321, 123456789, "Test lead", 110000, 'M');
        employee3.setEmployeeInfo("Naz", 456, 123456789, "SM", 120000, 'F');
        employee4.setEmployeeInfo("'Melek", 478, 123456789, "PO", 130000, 'F');
        employee5.setEmployeeInfo("Gul", 741, 123456789, "Test lead", 150000, 'F');
    }



}
