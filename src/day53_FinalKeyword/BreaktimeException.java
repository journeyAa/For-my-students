package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException {

    public BreaktimeException(){
        super("It's time for a break");
        System.err.println("Time to go home");
    }

    public BreaktimeException(String str){
        super();
    }



}

class Test{
    public static void main(String[] args) {

       //throw new RuntimeException("This is Runtime exception");
       throw new BreaktimeException();

    }


}
