package Warm_Ups.PHONE;
/*
PhoneTaks:
      1. create a class called Phone
                instance variables: model, price, screenSize
                static variabless (DO NOT initialize them): brand, operatingSystem, madeIn
                            No static block is neede!
                methods: call, text, selfie, setInfo, toString

 */
public class Phone {
    public String model;
    public double price;
    public String screenSize;

    public static String brand;
    public static String operatingSystem;
    public static boolean madeInChina;

   public void setInfo(String model, double price, String screenSize){
       this.model= model;
       this.price= price;
       this.screenSize = screenSize;

   }

   public void call(long phoneNumber){
       System.out.println("Calling to "+phoneNumber + " on " + model + ", "+ brand);
   }

   public void text(long phoneNumber){
       System.out.println("Texting to: " + phoneNumber);
   }

   public void selfie(){
       System.out.println("Taking selfies using "+ brand);
   }

    public String toString(){
        return "Brand: "+brand+"\nOperating System: "+operatingSystem+"\nMade in China-: "+madeInChina
                +"\nModel: "+model+"\nPrice: "+price+"\nScreen Size: "+screenSize;
    }

}
