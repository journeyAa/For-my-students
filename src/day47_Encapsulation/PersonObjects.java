package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Muhtar", 30, 'M', LocalDate.of(1988,05,06));

        System.out.println(person1);

        person1.setSsn(154639872);
        person1.setID(1089);
        person1.setAddress("California");

        System.out.println("SSN: " + person1.getSsn());
        System.out.println("ID: " + person1.getID());
        System.out.println("Address: " + person1.getAddress());











    }
}
