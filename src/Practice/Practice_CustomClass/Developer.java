package Practice.Practice_CustomClass;

/*
 create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()

 */
public class Developer {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name,char gender, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBug(){
        System.out.println(name + " is fixing bugs");
    }

    public String toString(){
        return "Name: " + name + "\nGender: " + gender + "\nEmployee ID: " + employeeID + "\nJob Title: " + jobTitle + "\nSalary: " +salary;
    }

}
