package day52_Exceptions;

import java.time.LocalDate;
import java.time.LocalTime;

public class ThrowPractice {
    public static void main(String[] args) {

        String driverName = "Chrome";
        if(driverName.equals("Chrome")){
            System.out.println("set up chrome");
        }else if(driverName.equals("firefox")){
            System.out.println("set up fire fox");
        }else if(driverName.equals("opera")){
            System.out.println("set up opera");
        }else{
            throw new RuntimeException("Invalid browser name");
        }

        System.out.println("================================================================");

        if(LocalTime.now().getMinute()==38){
            throw new RuntimeException("It is break time");
        }else{
            System.out.println("Continue");
        }




    }
}
