package Practice_CustomClass;

public class Offer {

    double salary;
    String state;
    boolean hasPO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPO, boolean isFullTime, boolean isWFH, String jobTitle, boolean hasBenefit) {
        this.salary = salary;
        this.state = state;
        this.hasPO = hasPO;
        isFullTime = isFullTime;
        isWFH = isWFH;
        jobTitle = jobTitle;
        hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){
        System.out.println("==============================================");
        System.out.println("Salary: "+salary);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Location: "+state);
        System.out.println("==============================================");
    }


}
