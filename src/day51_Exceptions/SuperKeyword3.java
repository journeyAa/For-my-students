package day51_Exceptions;

class C{
    public C(int a){
        System.out.println("Super class' int arg constructor");
    }
}

public class SuperKeyword3 extends C {// sub class has to call a constructor from super class
    public SuperKeyword3(int a){
        super(100);
        System.out.println("Sub class's constructor with int arg");
    }

    public static void main(String[] args) {
        new SuperKeyword3(100);
    }

    /*constructor call (in inheritance)
    1. super constructor MUST be called in sub class
    2. if super class constructor is default, it is implicitly called
    3. if super class constructor is not default, it needs to be called manually by super();
    * */
}
