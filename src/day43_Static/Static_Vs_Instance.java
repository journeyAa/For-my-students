package day43_Static;

public class Static_Vs_Instance {

    static int staticVariable;  // 1 copy
    int instanceVariable;       // 2 copies

    public static void main(String[] args) {
        Static_Vs_Instance obj1 = new Static_Vs_Instance();
        obj1.instanceVariable = 100;

        Static_Vs_Instance obj2 = new Static_Vs_Instance();
        obj2.instanceVariable = 200;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println(Static_Vs_Instance.staticVariable);
    }

}
