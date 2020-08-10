package repl.itAssignments;

import java.util.Scanner;

public class tipCalculatot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();
        //System.out.print(split);

        if(split.equalsIgnoreCase("yes")){
            System.out.println("Number of people:" );
            int numOfPpl = scan.nextInt();
           // System.out.print(numOfPpl);

            System.out.println("Check amount:" );
            double wholeAmount = scan.nextDouble();
            //System.out.print(wholeAmount);

            System.out.println("Service Quality:");
            String serviceQuality = scan.next();
           // System.out.print(serviceQuality);

            String numPplAmpersand = "";
            for (int i = 1; i <= numOfPpl; i++) {
                numPplAmpersand += "&";
            }

            double tipAmount = 0.0;

            switch (serviceQuality.toLowerCase()){
                case"poor":
                    tipAmount = wholeAmount * 0.05;
                    break;
                case"fair":
                    tipAmount = wholeAmount * 0.10;
                    break;
                case"good":
                    tipAmount = wholeAmount * 0.15;
                    break;
                case"great":
                    tipAmount = wholeAmount * 0.20;
                    break;
                case"excellent":
                    tipAmount = wholeAmount * 0.25;
                    break;
            }

            double totalPerPerson = (wholeAmount+tipAmount) / numOfPpl;
            double tipPerPerson = tipAmount / numOfPpl;

            System.out.println("Number of people entered: " + numPplAmpersand);
            System.out.println("Total to pay: " + (wholeAmount+tipAmount ));
            System.out.println("Total tip: " + tipAmount);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        }





















    }
}
