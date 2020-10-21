package Practice.Practice_CustomClass;
/*
Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary
    Actions:
        attendMeeting, Workoing, getInfo, SetInfo
    ArrayList of employees:
        1. remove all the employtees who are makeing lass than 100K
        2. remove all the QAs

 */
public class Employee {
    String employeeName;
    char gender;
    long SSN;
    int employeeID;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char gender, long SSN, int employeeID, String jobTitle, double salary){

    }

    public void getEmployeeInfo(){
        System.out.println("Name: " + employeeName+ ", Gender: " + gender + ", JobTitle: " + jobTitle + ", Salary: "+ salary);


    }

}
