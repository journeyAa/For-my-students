package day58_Polymorphism;

import dayyyyy_Review.day56_Abstraction.Iphone;
import dayyyyy_Review.day56_Abstraction.Phone;
import dayyyyy_Review.day56_Abstraction.SamSung;

public class TypeCasting {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Al", 2, 'M');

        Animal animal = dog1; // done implicitly

        Animal cat = new Cat("El", 1, 'F'); // converting sub type to super type

        System.out.println("**********************Explicit Casting*****************************");

        int x = 100;
      //  byte y = x;  can't be done, sp
        byte y = (byte) x;
        Animal animal3 = new Dog("Bo", 3, 'F');
        // animal3.bark(); can't be done

     //   Dog dog2 = animal3;  can't assign big to small, and needs exlicitly done
        Dog dog2 = (Dog) animal3;
        dog2.bark(); // there must be a IS A RELATIONSHIP


        Iphone phone1 = new Iphone("iPhone", "12", 1300, "big");
        Phone phone2 = phone1; // done implicitly// upcasting

        Phone phone3 = new SamSung("Samsung", "Galaxy12", 1000, "big");
        SamSung phone4 = (SamSung) phone3;  // assigning small to big so needs downcasting

       // Iphone phone5 = (Iphone) phone3; // this will give classCastException











    }



}
