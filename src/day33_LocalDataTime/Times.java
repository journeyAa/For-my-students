package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {

        LocalTime t1 =  LocalTime.of(15,40,15);
        LocalTime t2 =LocalTime.of(23,59,55,22);
        System.out.println(t1);

        LocalTime t3 = LocalTime.now();
        System.out.println(t3);

        System.out.println(LocalTime.now());

        LocalDateTime t4 = LocalDateTime.of(2020,7,25 ,15,28,58,100);

        System.out.println(t4);

        LocalDateTime t5 = LocalDateTime.now();
        System.out.println(t5);

        LocalDateTime t6 = LocalDateTime.of(2020,5,15,12,45,10);
        System.out.println(t6);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);











    }
}
