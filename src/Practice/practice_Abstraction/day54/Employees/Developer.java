package Practice.practice_Abstraction.day54.Employees;

import java.time.LocalDate;

 public final class Developer extends Employee {

    /*
      3. create a sub class of Employee named Developer(meant to be subClass ONLY)

     */

    public Developer(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary){
        super(name,gender,dateOfBirth,jobTitle,salary);
    }
}
