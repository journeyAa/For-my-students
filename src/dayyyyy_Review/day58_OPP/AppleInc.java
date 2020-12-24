package dayyyyy_Review.day58_OPP;

import day36_ArrayList.ArrayList_Method;
import day42_Static.ScrumTeam;
import dayyyyy_Review.day57_Polymorphism.employees.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {

        Employee[] workers =  {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M')
        };


        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));

        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

//        ScrumTeam.forEach( each -> {if(each instanceof Tester){ countTester++})
//        scrumTeam.forEach(each -> {
//            if (each instanceof Tester) {
//                countTester++};
//            else if (each instanceof Developer) {
//                countDeveloper++;
//            }
//        });

        for (Employee each: scrumTeam){
            if(each instanceof Tester){
                countTester++;
            }else if(each instanceof  Developer){
                countDeveloper++;
            }else{
                countScrumMaster++;
            }
        }

        System.out.println("countScrumMaster = " + countScrumMaster);
        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTester = " + countTester);






















    }
}
