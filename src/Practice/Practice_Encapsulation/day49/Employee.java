package Practice.Practice_Encapsulation.day49;

public class Employee extends Person{
    /*
    create a subclass of Person called Employee attributes:
    name, age, gender, Salary, ID, jobTitle methods: work, setEmployeeInfo
     */

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age,gender);
        this.salary=salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
