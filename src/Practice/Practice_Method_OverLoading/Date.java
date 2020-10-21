package Practice.Practice_Method_OverLoading;
import  java.time.LocalDate;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        LocalDate DOB = LocalDate.of(1986,5,26);
        System.out.println(DOB);

       LocalDate today =  LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2020,1,20);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result2);
        System.out.println("=================================================");


        System.out.println("Enter your birth year, birth month, birthday");

        LocalDate b = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(b);
        System.out.println(b.isLeapYear());







    }
}
