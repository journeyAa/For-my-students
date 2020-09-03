package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
 */
public class Employee extends Person{
    // name, age, gender is inherited
    // getSsn(), setSsn(), sleep(), setPersonInfo(name, age, gender)

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age, gender);  // sets the info for the Person Class
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        // method overloading, sets name, age, gender, salary, id, jobTitle
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Salary: $"+salary+"," +
                " Employee ID: "+ID+", Job title: "+jobTitle;
    }



}
