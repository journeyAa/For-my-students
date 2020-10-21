package Git;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import repl.itAssignments.Method_returnWaterTax;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Phone{
    static int number;

    public Phone(String str){
        this(str.length());
    }

    public Phone(int num){
        this();
        number+=num;
    }

    public Phone(){
        number+=1;
    }
}

class CallPhones{
    public static void main(String[] args) {
        new Phone("iphone");
        new Phone();
        new Phone(4);

        System.out.println(Phone.number);
    }
}


