package Practice_ArRays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
write a program that can count the frequency of a word from an array of String
ex: arr : {"java", "pyhon" , "java"}
word: "java"
output : 2
 */
public class CountFrequencyOfWord_fromArrayString {
    public static void main(String[] args){

        String[] arr = {"java", "python", "c#", "java"};
        String word = "java";

        int count = 0;

        for (String each: arr){
            if(!each.equals(word)){
               continue;
            }
            count++;
        }
        System.out.println(count);


    }
}
