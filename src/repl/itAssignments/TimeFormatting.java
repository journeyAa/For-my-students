package repl.itAssignments;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
// Input: 07:05:45PM
// Output: 19:05:45

        LocalTime lt = LocalTime.of(7,5,45);
        System.out.println(lt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println(lt.format(dtf));











    }
}
