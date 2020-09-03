package day45_Constructor;

import Warm_Ups.SalaryCalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Paycheck {
    public static void main(String[] args) {

        SalaryCalculator job1 = new Warm_Ups.SalaryCalculator(15,40,0.7,0.5);
        SalaryCalculator job2 = new Warm_Ups.SalaryCalculator(25,40,0.7,0.5);
        SalaryCalculator job3 = new Warm_Ups.SalaryCalculator(45,40,0.7,0.5);
        SalaryCalculator job4 = new Warm_Ups.SalaryCalculator(65,40,0.7,0.5);
        SalaryCalculator job5 = new Warm_Ups.SalaryCalculator(85,40,0.7,0.5);

        ArrayList<SalaryCalculator> jobs = new ArrayList<>(Arrays.asList(job1, job2, job3, job4, job5));

        for (SalaryCalculator each: jobs){
            System.out.println(each);
            System.out.println();
        }








    }
}
