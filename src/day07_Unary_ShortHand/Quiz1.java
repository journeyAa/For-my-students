package day07_Unary_ShortHand;

import com.sun.org.apache.bcel.internal.util.ClassStack;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        int num = 2;
        boolean b = true;

        switch(num){
            case 0:
                b = false;
            case 1:
                System.out.println(1);
            case 2:
                if(b){
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if(b){
                    System.out.println(3);
                    b = false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.println(5);
        }















    }



}
