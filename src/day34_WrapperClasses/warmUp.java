package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmUp {
    public static void main(String[] args) {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("EEEE, hh,mm a, MMM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        System.out.println(today.format(dft));











    }
}
