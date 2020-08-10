package day21_Loops;

// print 1 - 20

public class DoWhile_Practice {
    public static void main(String[] args) {

        int num = 1;

        do{

            System.out.print(num + " ");
            num++;

        }while(num <= 20);

        System.out.println();
        System.out.println(num);

        // branching statement:
        // continue: can only be used in loops
        // break: can only be used in loops and switch
        // system.exit(0) can be used anywhere


        char ch = 'A';
        do{
            System.out.print(ch + " ");
            ch++;
        }while(ch <= 'Z');

















    }
}
