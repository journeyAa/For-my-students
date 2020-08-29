package Warm_Ups;
/*
 2.  Create a class called Offer that has:
               fields :
                    location, company, salary , isFullTime
                create a constructor that can initialize all the fields

            toString -- print all info about offers

 */
public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public Offer(String location, String company, double salary, boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }
    public String toString(){
        return "Company Name: " + company + "\nLocation: " + location + "\nAnnual Salary: " + salary + "\nFull Time: " + isFullTime;
    }
}
