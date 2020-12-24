package day53_FinalKeyword;

public class InvalidBrowserException extends RuntimeException {

    public InvalidBrowserException(){
        super("Invalid browser name");
    }

    public InvalidBrowserException(String str){
        super(str);
        System.err.println("finally this is making sense");
    }



}


class Test2{
    public static void main(String[] args) {
        String name = "Cybertek";

        switch (name){
            case"chrome":
                System.out.println("Chrome browser is selected");
                break;
            case"firefox":
                System.out.println("Firefox browser is selected");
                break;
            case"safari":
                System.out.println("Safari browser is selected");
                break;
            default:
                throw new InvalidBrowserException("please enter a valid browser name");



        }

        throw new InvalidBrowserException();









    }

}