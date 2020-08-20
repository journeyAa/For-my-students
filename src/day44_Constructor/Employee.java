package day44_Constructor;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static { // static variables better initialized in the static initializer block
        // runs only once and in the very beginning
        isEmployed =true;
        hasSalary=true;
    }

    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
        isEmployed = isEmployed;
        hasSalary = hasSalary;

    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary;
    }

}
