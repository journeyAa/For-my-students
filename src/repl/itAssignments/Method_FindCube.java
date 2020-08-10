package repl.itAssignments;

import java.util.Scanner;

public class Method_FindCube {
    public static void main(String[] args) {
        cube();
        hello();
        world();
        printHollowRect();



    }
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num*num*num);
    }

    public static void hello(){
        System.out.print("Hello ");

    }
    public static void world(){

        System.out.print("World!");
        System.out.println();
    }

    public static void printHollowRect(){
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("*   *");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
    }

}































