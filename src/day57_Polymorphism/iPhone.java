package day57_Polymorphism;
/*
  5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphon is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500

 */
public class iPhone extends Phone implements AppleApp, Downloadable {

    public iPhone(String model, String size, double price){
        super("Iphone", model, size, price);
        if(price>1500){
            throw new RuntimeException("Iphone price can not be greater than 1500");
        }
    }





    @Override
    public void texting(long phoneNumber){
        System.out.println("iPhone is texting to " + phoneNumber);

    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("iPhone is calling to " + phoneNumber);
    }


    @Override
    public void download() {

    }
}
