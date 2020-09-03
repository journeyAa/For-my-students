package Practice_Constructor;

public class Employee {
    String name;
    int id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {
        isEmployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name, int id, long ssn, String jobTitle, double salary, char gender){
        this.name= name;
        this.id = id;
        this.jobTitle= jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name: "+name+", ID: " +id+", Job Title: "+jobTitle+", Salary: "+salary+" Gender: "+gender;
    }




}
