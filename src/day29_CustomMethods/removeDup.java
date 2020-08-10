package day29_CustomMethods;

public class removeDup {
    public static void main(String[] args) {
        removeDup("abcaadd");


    }

   public  static void removeDup(String str){
       String nonDup = ""; //"ab"

       for (String each: str.split("")){
           if(!nonDup.contains(each)){
               nonDup+=each;
           }
       }
       System.out.println(nonDup);



   }

}
