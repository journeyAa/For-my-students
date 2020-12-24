package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class IteratingKeyValues {
    public static void main(String[] args) {

        Map<String, LocalDate> bday = new TreeMap<>();

        bday.put("Ali", LocalDate.of(1986,02,15));
        bday.put("Nabi", LocalDate.of(1578,02,15));
        bday.put("Muhtar", LocalDate.of(1976,05,19));

        for (String each: bday.keySet()){
            System.out.println(each);
        }

        for (LocalDate each : bday.values()){
            System.out.println(each);
        }











    }
}
