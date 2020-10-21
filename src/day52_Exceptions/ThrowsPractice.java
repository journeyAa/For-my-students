package day52_Exceptions;

public class ThrowsPractice {
    public static void m1() throws InterruptedException {
        Thread.sleep(3000);

    }

    public static void m2()throws InterruptedException{
        m1();
    }

    public static void m3(){
        try{
            m1();
            m2();
        }catch (InterruptedException e){

        }




    }
}

