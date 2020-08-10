package repl.itAssignments;

import java.util.Scanner;

public class scannerSeniorCitizenAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizen and nonSeniorCitizens:");

        int seniorCitizen = scan.nextInt();
        int nonSeniorCitizen = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if(age >= 65){
            seniorCitizen+=1;
            System.out.println("Senior Citizen");
        }else if(age < 65){
            nonSeniorCitizen+=1;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizen count " + seniorCitizen);
        System.out.println("New nonSeniorCitizen count " + nonSeniorCitizen);




    }
}
