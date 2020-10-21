package day57_Polymorphism;

import sun.plugin.com.AmbientProperty;

/*
6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */
public class SamSung extends Phone implements Downloadable, AndroidApp {

    public SamSung(String model, String size, double price){
        super("SamSung", model, size, price);


    }




    @Override
    public void download() {

    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }
}
