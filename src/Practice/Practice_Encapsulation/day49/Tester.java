package Practice.Practice_Encapsulation.day49;

public class Tester extends Employee {
    /*
    create a subclass of Employee called Tester
    Attributes:name, age, gender, Salary, ID, jobTitleActions:
    setInfo(), smokeTesting(),  creatingTicket(), toString()
     */

    public Tester(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name, age, gender,salary,ID,jobTitle);
    }

    public void smokeTesting(){
        System.out.println("Tester: "+name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating tickets on JIRA");
    }




}
