package Practice.Practice_Constructor.day42;

public class Developer {

    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
        this.name= name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;

    }

    public void coding(){
        System.out.println(name+ " is conding");

    }

    public void fixBugs(){
        System.out.println(name+ " is fixing bugs");

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
