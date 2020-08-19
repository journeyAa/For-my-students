package Practice_CustomClass;
/*
 create a class called Testers
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */
public class Tester {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.gender =gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smokeTest(){
        System.out.println(name + " is smoke testing");
    }

    public void createTicket(){
        System.out.println(name + " is creating a ticket");
    }

    public String toString(){
        return "Name: " + name + "\nGender: " + gender + "\nEmployee ID: " + employeeID + "\nJob Title: " + jobTitle + "\nSalary: " +salary;
    }

}
