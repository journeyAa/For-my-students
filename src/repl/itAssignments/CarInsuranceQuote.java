package repl.itAssignments;

import java.util.Scanner;

public class CarInsuranceQuote {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        int zipCode = 0;
        int age = 0;
        int experience = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        String accidents = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String hasDriverLicense = scan.next();
        if(hasDriverLicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        if((zipCode==20910) || (zipCode==20740)){
            premium+=60;
        }else if (zipCode == 22102 || zipCode == 22103){
            premium+=30;
        }else{
            premium+=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();

        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium+=10;
        }else{
            premium+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        switch (vehicleUsage){
            case "Business":
                premium+=50;
                break;
            case "Pleasure":
                premium+=10;
                break;
            case "Commute":
                premium+=20;

                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium+=daysDrivenToWorkOrSchool*5;

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium+=milesToWorkOrSchool*1;
                break;
        }

        System.out.println("How old are you?");
        age = scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>= 16 && age< 18){
            premium*=20;
        }else if(age >= 18 && age <= 21){
            premium*=6;
        }else if(age > 21 && age < 25){
            premium*=2;
        }

        System.out.println("How many years you've been driving?");
        experience = scan.nextInt();
        int subtraction = age - experience;
        if((experience>0) && subtraction > 16){
            premium -= experience*5;
        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        accidents = scan.next();
        if(accidents.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium+=premium*accidentsAmount*0.2;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium*=2;
        }
        scan.nextLine();

        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")){
            premium-= premium * 0.05;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium-= premium * 0.10;
        }else if(education.equalsIgnoreCase("Less than High School")){
            premium+= premium * 0.05;
        }
        System.out.println(name+ ", here's your quote!");
        System.out.println("Start Your Policy Today for: $" + premium);

        referenceNumber = name.toUpperCase().substring(0,2)+age+name.toUpperCase().substring(name.length()-2)+zipCode+education.toUpperCase().replace(" ","");
        System.out.println("Reference number: "+referenceNumber);

        System.out.println("Reference number: " + referenceNumber);




    }
}
