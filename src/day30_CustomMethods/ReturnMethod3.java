package day30_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ReturnMethod3 {
    public static void main(String[] args) {
        int[] arr = {100,-95,456,124};
        int num = max(arr);
        System.out.println(num);
        System.out.println(num > 300);

    // does not return value
        // int num2 = max2(arr);


    }



    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;

    }

    public static void max2(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];

    }


}
