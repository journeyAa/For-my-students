package day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {

        int[] arr ={10, 20};

        try{
            System.out.println(arr[20]);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is handled");

        }catch (ClassCastException e){

            System.out.println("Class Cast Exception");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bond Exception");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bond Exception");

        }catch (RuntimeException e){
            System.out.println("Run Time Exception");
        }

        System.out.println("=================================================");

        String str = "Cybertek";
        try{
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){// Runtime exceotoon can handle any unchecked exception
            System.out.println(e.getMessage());
        }


        System.out.println("=====================================================");

        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("Completed");

        System.out.println("==========================================================");

        try{
            System.out.println(8/0);
            System.out.println("Try block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
        }










    }
}
