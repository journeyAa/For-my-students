package Practice.practice_Abstraction.day54.Employees;

import java.time.LocalDate;

 public final class Tester extends Employee {
    /*
     2. create a sub class of Employee named Tester(meant to be subClass ONLY)

     */
    public Tester(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary){
        super(name,gender,dateOfBirth,jobTitle,salary);
    }

    public void findBugs(){
        System.out.println(name+ " found bugs");
    }


}
