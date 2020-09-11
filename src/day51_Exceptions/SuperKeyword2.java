package day51_Exceptions;

class B{

    public B(){
        System.out.println("Super class's default constructor");
    }

}


public class SuperKeyword2 extends B { // mandatory for the sub class to call super class
    public SuperKeyword2(){
        super(); // call the super class's constructor, if it is default, it is called implicitly
        System.out.println("Sub class's default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();


    }





}
