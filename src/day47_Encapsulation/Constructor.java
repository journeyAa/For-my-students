package day47_Encapsulation;

import day19_ForLoop.ContinueStatement;

public class Constructor {

    static {
        System.out.println("static block");
    }

    public Constructor(int a){

    }

    public static void main (String[] args){

        // new Constructor

        new Constructor(10);


    }
}
