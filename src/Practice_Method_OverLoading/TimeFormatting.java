package Practice_Method_OverLoading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2020,8,5);
        System.out.println(ld);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yy, E");

        System.out.println(ld.format(dateFormat));


        LocalTime now = LocalTime.now();
        System.out.println(now);

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(now.format(timeFormat));

        System.out.println("=========================================");

        // May/20/2019 DayName 4:30 pm

        LocalDateTime format = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(format);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");

        System.out.println(format.format(format1));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow =  LocalDateTime.now();
        System.out.println(rNow);
        System.out.println(rNow.format(dtf));


        System.out.println("=====================================================");

















    }
}
