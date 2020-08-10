package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
// year: yy, yyyy
// month : MM, MMM, MMM
// days: dd
// days name : E(three letter), EEEE(full name)
public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy");

        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(  ld.format(DateFormat));

        LocalTime now = LocalTime.now();


        // hours : hh
        // minutes: mm
        // seconds: ss
        // am/pm : a

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        System.out.println(now1.format(timeFormat));

        // May/20/19 Dayname 4:30 pm

        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd//yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,26,12,34);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));

        //Saturday 4:35:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);

        System.out.println(Now.format(dtf));





    }
}
