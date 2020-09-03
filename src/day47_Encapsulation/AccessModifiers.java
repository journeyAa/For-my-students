package day47_Encapsulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class AccessModifiers {
    // public
    public static int publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }

    // static int i = 200; // the default access modifier is given

    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("default method");
    }

    //private
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("Private method");
    }










}
