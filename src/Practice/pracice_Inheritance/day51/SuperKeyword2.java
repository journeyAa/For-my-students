package Practice.pracice_Inheritance.day51;

class B{
    public B(String a){
        System.out.println("Super class default constructor");
    }


}

public class SuperKeyword2 extends B {

    public SuperKeyword2(){
       super("apple"); // it is for calling the super class's constructor
        System.out.println("Sub class default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();

    }

}
