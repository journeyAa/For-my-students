package day45_Constructor;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate ){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyHours*48;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString(){
        return "Salary: "+salary()+"\nState Tax: "+ stateTax()
                + "\nFederal Tax: " +federalTax() +
                "\nSalary After Tax: " + salaryAfterTax();
    }



}
