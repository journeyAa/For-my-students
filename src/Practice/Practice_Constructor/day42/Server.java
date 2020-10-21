package Practice.Practice_Constructor.day42;

public class Server {
    /*
    Attributes:

name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Actions: (all void methods)

setInfo(): sets all of the instance variables with some values taken from the parameters.

takeOrder(): server's name + "is taking an order"

cleanTable(): server's name + "is cleaning the table"

toString(): Returns (String) all the information of a Server
-> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
     */

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime){
        this.name=name;
        this.employeeID=employeeID;
        this.hourlyRate=hourlyRate;
        this.fullTime=fullTime;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name+ " is cleaning the table");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
