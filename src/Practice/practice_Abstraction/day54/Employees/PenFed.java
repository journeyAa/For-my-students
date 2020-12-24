package Practice.practice_Abstraction.day54.Employees;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Virginia", 'F', LocalDate.of(1990,11,20), "SDET", 120000);

        Tester tester1 = new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"KABADAYI",1500000);

        System.out.println(developer1.gender);

        System.out.println(tester1.gender);

        System.out.println(developer1.dateOfBirth);

        System.out.println(developer1.dateOfBirth);













    }
}
