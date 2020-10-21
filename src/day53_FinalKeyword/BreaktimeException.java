package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException { // custom unchecked exception

    public BreaktimeException(){
        super("It's time for a break");
        System.err.println("Time for dinner");
    }

    public BreaktimeException(String str){
        super(str);
    }

}

class Test{
    public static void main(String[] args) {

      // throw new RuntimeException("This is Runtime Exception");
    //throw new BreaktimeException("time for a little break");


        throw new BreaktimeException("it's been 45 mins");
    }
}

