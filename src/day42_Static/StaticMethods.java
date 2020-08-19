package day42_Static;

public class StaticMethods {
    int a = 200;
    static int b = 400;


    public static void main(String[] args) {
        System.out.println(b);
       // System.out.println(a); // static wont accept instance variable
       // System.out.println(this.a);
        //creating the object and calling though the object is the only way to use the instance

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
        // the ONLY way to call instances in a static method
        staticMethod();
        obj.instanceMethod();

      //  instanceMethod();
        StaticMethods.staticMethod();

    }

    public static void staticMethod(){


    }

    public void instanceMethod(){

    }




}
