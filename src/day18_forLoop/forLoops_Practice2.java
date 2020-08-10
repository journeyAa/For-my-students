package day18_forLoop;

public class forLoops_Practice2 {
    public static void main(String[] args) {
        /*1. Write a program that can print all even numbers between 0 -- 1000
        * 2. Write a program that can print all odd numbers between 0---1000;
        * 3. Write a program that can print a-z
        * 4. Write a program that can print A-Z*/

        for(int i = 0; i <= 1000; i += 2){
            System.out.println(i);
        }

        for(int i = 1; i <= 1000; i += 2){
            System.out.println(i);
        }

        for(char ch = 97; ch <= 122; ch++){
            System.out.println(ch);
        }

        for(char ch = 65; ch <= 90; ch++){
            System.out.println(ch);
        }

        for(int monkey = 5; monkey > 0; monkey--){
            System.out.println(monkey + " little monkey jumping on the bed, one fell off and bump his head");
        }
        System.out.println("no more monkey jumping on the bed");







    }
}
