package Warm_Ups.PHONE;

import com.sun.org.apache.xpath.internal.operations.And;

/*
  2. creata a subclass of Phone called iPhone
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, faceTime

 */
public class iPhone extends Phone {
    public static boolean hasFaceTime;
    public static boolean useIOS;

    static {
        hasFaceTime=true;
        useIOS =true;
    }

    public iPhone(String model, double price, String screenSize){
        setInfo(model,price,screenSize);
    }

    public void faceTime(){
        System.out.println("All apple products use IOS: " +useIOS + " And Apple users can use facetime: "+ useIOS);
    }
}
