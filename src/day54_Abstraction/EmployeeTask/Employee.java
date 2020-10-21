package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class Employee {
    /*
     1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
            Action:

     */


    public String name;
    final public char gender;
    final public LocalDate DOB;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Date of Birth: "+DOB+", Job Title: "+jobTitle+", Salary$: "+salary;
    }


}
