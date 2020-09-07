package Office_Hours.Practice_08_31_2020;

public class Static_Vs_Instance {
    int insVariable; // is not accepted in static
    static int staticVariable;// also called global variables, accepts everywhere

    public static void main(String[] args) {
        System.out.println(staticVariable);
       // System.out.println(insVariable); static only accepts static

        Static_Vs_Instance obj = new Static_Vs_Instance(); // the only way to call instance variables
        System.out.println(obj.insVariable); //0

        System.out.println("=============================================");
        /*
        static only accepts static members, but not any other members
        static and instance can be called through the objects
       because static belongs to the class and objects are created from the class, so
       static can be also called thought the object. instance can be called though objects
       as well.
       static can be called thought the class name as well, since it belongs to the class
       static can be called though the objects as well, because objects are created from the class
         */

        Static_Vs_Instance obj1 = new Static_Vs_Instance();
        obj1.insVariable = 100;
        obj1.staticVariable = 200;
        // each object has their own copy of the instances


        Static_Vs_Instance obj2 = new Static_Vs_Instance();

        System.out.println(obj1.insVariable);
        System.out.println(obj1.staticVariable);// cuz class attributes are shared by all the objecs in the class
        // value is 0;

        System.out.println(obj2.insVariable); // 0
        System.out.println(obj2.staticVariable); // 200 , because only one copy in static

    // calling the static, it is better to call from the class name
        System.out.println(Static_Vs_Instance.staticVariable);


    }

    public void method1(){
        System.out.println(insVariable);
        System.out.println(staticVariable);// instance method also accept static variable
    }

}
