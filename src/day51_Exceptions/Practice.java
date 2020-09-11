package day51_Exceptions;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

class X{
    public X(){
        //super();
        System.out.println("X");
    }

}

class Y extends X{
    public Y(){
        // super() // X
        System.out.println("Y");
    }

}

class Z extends  Y{
    public Z(){
        //super () X Y
        System.out.println("Z");
    }

}



public class Practice {
    public static void main(String[] args) {

        new Z();

    }
}
