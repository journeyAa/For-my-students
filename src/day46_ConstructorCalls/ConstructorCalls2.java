package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A");

    }

    public ConstructorCalls2(int a){
     //   ConstructorCalls2();
        this();  // calling default constructor
        System.out.println("B");
    }

    public ConstructorCalls2(String str){
        this(4);  // A B
        System.out.println("C");
    }

    public ConstructorCalls2(char a){
        this(); // A
        System.out.println("D");
    }

    public ConstructorCalls2(double a){
        this(10);
    }


    public static void main(String[] args) {
        new ConstructorCalls2(10); // A B
        new ConstructorCalls2("Cybertek");










    }
}
