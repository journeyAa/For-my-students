package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
  2. create a sub class of Employee named Tester(meant to be subClass ONLY)
 */
public final class Tester extends Employee {
    public Tester(String name, char gender, LocalDate DOB, String jobTitle, double salary){
        super(name, gender,DOB, jobTitle,salary);
    }

    public void findBug(){
        System.out.println(name+" found a bug");
    }

}
