package Office_Hours.Practice_09_08_2020;

public class Data {
    private int a = 100; // same package thus is visible
     private static void method1(){

    }

    public void method2(){
        method1();
    }
}

class Test{
    public static void main(String[] args) {
        Data obj1 = new Data();
    //    System.out.println(obj1.a);

      //  obj1.method1();

        /*
        hiding the data by giving private and use public getter/setter instance method to read and modify
         */





    }

}
