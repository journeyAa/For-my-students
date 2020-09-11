package day51_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(arr[100]); // unchecked exceptions (unexpected event), occurs during runtime
        // Runtime exception is the parent of all the unchecked exception

     //   Thread.sleep(3000); // checked exceptions (unwanted event), occurs during compile time, need to handle immediately

        String str = "Cybertek";
        System.out.println(str.charAt(-1));






    }
}
