package UyghurEarlyBirds;
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
public class Server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean isFullTime;

    public void setInfo(String name, int employeeID, double hourlyRate,boolean isFullTime ){
        this.name = name;
        this.employeeID=employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;

    }
    public void takeOrder(){
        System.out.println(name + "is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table" );
    }
    public String toString(){
        return "Name: " + name + "\nEmployee ID: " + employeeID + "\nHourly Rate: " + hourlyRate + "\nIs Full time? " + isFullTime;
    }
}
