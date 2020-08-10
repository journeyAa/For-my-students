package day28_Recap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FrequencyOfWord_Array {
    public static void main(String[] args) {
        String[] arr = {"java", "C#", "Python", "Java"};
        String word = "java";

        int count = 0;

        for (String each: arr){
            if(word.equalsIgnoreCase(each)){
                count++;
            }
           // if(word.equalsIgnoreCase(each)){
           //     continue;
            }
        System.out.println(count);
        }

    }

