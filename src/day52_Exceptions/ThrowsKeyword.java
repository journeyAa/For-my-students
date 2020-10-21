package day52_Exceptions;

public class ThrowsKeyword {
    public static void method1(int seconds) throws InterruptedException {


        Thread.sleep(3000);

    }

    public static void main(String[] args) throws InterruptedException{
  //      method1(200);// problem isn't handled
        method2();
     //   method3();
        Thread.sleep(100);
    }

    public static void method2(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }

    public static void method3() throws InterruptedException{
        method2();
        method1(100);


    }
}

