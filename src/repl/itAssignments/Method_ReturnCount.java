package repl.itAssignments;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Method_ReturnCount {
  public static int count_appearance(String[] arr,String t){


      int count = 0;

      for (String each : arr){
          if(each.equals(t)){
              count++;
          }

      }
      System.out.println(count);
      return count;






  }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] some_array = new String[5];
        for (int i = 0; i <= some_array.length-1 ; i++) {
            some_array[i] = scan.next();
        }

        String some_string = scan.next();

        count_appearance(some_array,some_string);





    }
}
