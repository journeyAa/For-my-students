package Warm_Ups;
import java.util.ArrayList;
import java.util.Arrays;

import Warm_Ups.SalaryCalculator.*;

/*
  Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:

 */
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

// salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
    public double salary(){
        return    hourlyRate*weeklyHours*48;
    }
//stateTax(): reruns the total state tax as double ( salary * stateTaxRate)
    public double stateTax(){
        return salary() *stateTaxRate/100;
    }

// federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
    public double federalTax() {
        return salary() * federalTaxRate/100;
    }

//salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
    public double salaryAfterTax(){
        return salary() -stateTax() - federalTax();
    }

//   toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
    public String toString(){
        return "Hourly Rate: " + hourlyRate + "\nWeekly Hours: " + weeklyHours + "\nFederal Tax Rate: " + federalTaxRate
                + "\nState Tax Rate: " + stateTaxRate + "\nFederal Tax: " + federalTax() + "\nState Tax: " + stateTax()
                + "\nSalary: " + salary() + "\nSalary After Tax: " + salaryAfterTax();

    }

    public static void main(String[] args) {

        SalaryCalculator job1 = new SalaryCalculator(15,40,0.7,0.5);
        SalaryCalculator job2 = new SalaryCalculator(25,40,0.7,0.5);
        SalaryCalculator job3 = new SalaryCalculator(45,40,0.7,0.5);
        SalaryCalculator job4 = new SalaryCalculator(65,40,0.7,0.5);
        SalaryCalculator job5 = new SalaryCalculator(85,40,0.7,0.5);

        ArrayList<SalaryCalculator> jobs = new ArrayList<>(Arrays.asList(job1, job2, job3, job4, job5));

        for (SalaryCalculator each: jobs){
            System.out.println(each.toString());
        }






    }



}
