package Practice.Practice_Encapsulation.day47;

public class CapitalOneEmployees {

    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    private long ID;
    private double salary;
    private String address;

    public static String companyName = "Capital One";

    public long getID(){
        return ID;
    }

    public double getSalary(){
        return salary;
    }

    public String getAddress(){
        return address;
    }

    public void setID(long ID){
        this.ID=ID;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void setAddress(String address){
        this.address=address;
    }






}
