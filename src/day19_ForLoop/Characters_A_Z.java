package day19_ForLoop;

public class Characters_A_Z {
    public static void main(String[] args) {
// write a program that will print out all letters in English alphabet in ascending order
// .......................................................................decsending order

        for(char ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch + " " );
        }
        System.out.println();

        for(int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();

     // tasks 06
        System.out.println("===================================================");

     for(char ch = 'Z'; ch >= 'A'; ch--  ){
         System.out.print(ch + " ");
     }
        System.out.println();

        for(char i = 90; i >= 65; i--){
            System.out.print(i + " ");
        }





















    }
}
