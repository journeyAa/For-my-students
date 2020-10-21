package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class Developer extends Employee{

    public Developer(String name, char gender, LocalDate DOB, String jobTitle, double salary) {
        super(name, gender, DOB, jobTitle, salary);
    }
}


// class BA extends Developer
// final class can never be super class