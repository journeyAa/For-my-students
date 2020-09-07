package Warm_Ups.PHONE;

import day48_Inheritance.Device.Device;

/*
  3. creata a subclass of Phone called Samsung
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, freeze

 */
public class Samsung extends Device {
    public static boolean freeze = true;

    public Samsung(String model, double price, String screenSize){
        setInfo(brand,model,price, hasBattery,hasMemory,screenSize);
    }

   public void freeze(){
       System.out.println(brand + " always freezes after using for sometime");
   }
}
