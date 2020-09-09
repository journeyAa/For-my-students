package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone {

    public Iphone(String model, double price){
        super(model, price); // set the model and price of the phone
    }

    static {
        brand = "iPhone";
        madeIn = "USA";
    }

    public void call(long phoneNumber){
        System.out.println("iPhone"+model+" is calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("iPhone that is made in "+madeIn+ " is texting to: "+ phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Price: $"+price+", Made in: "+madeIn;
    }



}
