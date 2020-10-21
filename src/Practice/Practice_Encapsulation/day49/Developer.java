package Practice.Practice_Encapsulation.day49;

public class Developer extends Employee {
    /*
    create a subclass of Employee called called Developer
    Attributes:ame, age, gender, Salary, ID, jobTitleActions:setInfo(), coding(),  fixBug(), toString()
     */

    public Developer(String name, int age, char gender, double salary, int ID, String jobID){
        setInfo(name,age, gender,salary,ID,jobTitle);
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void fixBug(){
        System.out.println(name + " is fixing bugs");
    }



}
