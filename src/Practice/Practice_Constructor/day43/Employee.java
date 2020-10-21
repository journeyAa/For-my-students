package Practice.Practice_Constructor.day43;

public class Employee {
    /*
    warmup task:
    1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string


     */

    String name;
    long ID;
    long SSN;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long ID, long SSN, String jobTitle, double salary, char gender){
        this.name=name;
        this.ID=ID;
        this.SSN=SSN;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", SSN=" + SSN +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
