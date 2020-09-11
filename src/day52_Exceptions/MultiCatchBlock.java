package day52_Exceptions;

import day41_toString.Class;

public class MultiCatchBlock {
    public static void main(String[] args) {

        int[] arr ={10, 20};
        try{
            System.out.println(arr[20]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is handled");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Array Index out of Bound Exception "); // exception handled
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of Bound Exception ");
        }catch (RuntimeException e){
            System.out.println("Run Time Exception");// it can handle all the run time exception
        }

        System.out.println("===================================================");

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){ // can handle any unchecked exception
            System.out.println(e.getMessage());
        }

        System.out.println("================================================================");

        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("completed");
        System.out.println("=======================================================================");
        











    }
}
