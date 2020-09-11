package day51_Exceptions;

class Test{
    int a;  // 200
}

public class SuperKeyword extends Test{
    // a= 300;
    public void print1(){
        System.out.println( a); // no same name, so it calls from current class == 300
    }

    public void print2(){
        System.out.println(super.a); // 200

    }

}
