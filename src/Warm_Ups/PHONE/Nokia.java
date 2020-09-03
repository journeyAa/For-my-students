package Warm_Ups.PHONE;
/*
 4. creata a subclass of Phone called Nokia
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, breakTheFloor

 */
public class Nokia extends Phone{
    static {
        brand = "Nokia";
        operatingSystem = "Symbian OS";
        madeInChina = true;
    }

    Nokia(String model, double price, String screenSize){
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public void setInfo(String model, double price, String screenSize ){
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public void breakTheFloor(){
        System.out.println("When you drop your " + brand +" on the floor, there will be crack on the floor" +
                ", but not on your " + brand);
    }


}
