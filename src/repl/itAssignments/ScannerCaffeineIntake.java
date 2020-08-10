package repl.itAssignments;

import java.util.Scanner;

public class ScannerCaffeineIntake {
    public static void main(String[] args) {
        //Write a program with a variable that holds the number of milligrams of caffeine in a drink
        // and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg

       // Scanner scan = new Scanner(System.in);
        //System.out.println("Enter number of milligrams in drink:");
       // int numOfMilligrams = 1 / 1000

        System.out.println("Enter number of milligrams in drink:");
        Scanner scan = new Scanner(System.in);
        int numOfMilligrams = scan.nextInt();
        int drink = 10*1000 / numOfMilligrams;
        System.out.println("It would take about " + drink + " drinks for a lethal overdose.");



//        System.out.println("Enter number of milligrams in drink:");
//        Scanner scan=new Scanner(System.in);
//        int numOfMilligrams=scan.nextInt();
//        int drinks=(10*1000)/numOfMilligrams;
//        System.out.println("It would take about "+drinks+" drinks for a lethal overdose.");









    }
}
