package Office_Hours.Practice_09_09_2020;

import Warm_Ups.PHONE.Samsung;

public class SamSung extends  Phone{
    // 4 variables
    // 3 methods

    public SamSung(String model, double price){
        super(model, price);
    }

    static {
        brand = "SamSung";
        madeIn = "Korea";
    }

    public void call(long phoneNumber){
        System.out.println("SamSung "+model+" is calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("SamSung "+model+" is texting: "+phoneNumber);
    }






}
