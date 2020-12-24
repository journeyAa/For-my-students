package day58_Polymorphism;


import dayyyyy_Review.day56_Abstraction.Iphone;
import dayyyyy_Review.day56_Abstraction.Phone;

public class DownCasting_Practice {
    public static void main(String[] args) {

        Phone phone1 = new Iphone("Iphone", "11", 12000, "6");

        Iphone iphone = (Iphone) phone1;
        iphone.faceTime(123456);

















    }
}
