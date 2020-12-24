package Practice.practice_Abstraction.day54.Employees;

import sun.util.resources.LocaleData;

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
    final public char gender; // constant
    public final LocalDate dateOfBirth;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary){
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }



}
