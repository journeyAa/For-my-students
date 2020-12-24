package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException { // custom unchecked exception

    public BreaktimeException(){
        super("time for a break" );
        System.err.println("I miss Muhtar");

    }
    public BreaktimeException(String str){
        super(str);
        System.out.println("It is time for 10 mins break");
    }


}

class Test{
    public static void main(String[] args) {

     //   throw new RuntimeException("This is Runtime exception");
        throw new BreaktimeException();

        // throw new Test();




    }





}

