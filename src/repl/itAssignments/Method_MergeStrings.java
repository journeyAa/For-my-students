package repl.itAssignments;

public class Method_MergeStrings {
    public static void main(String[] args) {

        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        str2 = str2.toLowerCase();

        System.out.println(mergeStrings(str1,str2));










    }
   public static String mergeStrings(String one, String two){
       String result = "";

       if(one.length()==two.length()){
           for (int i = 0; i <= one.length()-1 ; i++) {
               char ch1 = one.charAt(i);
               char ch2 = two.charAt(i);
               result += "" + ch1 + ch2;

           }

       }else if(one.length()>two.length()){
           for (int i = 0; i <= two.length()-1 ; i++) {
               char ch1 = one.charAt(i); // 123
               char ch2 = two.charAt(i); // 123
               result += "" + ch1 + ch2;

           }
           result = result + one.substring(two.length());

       }else{ //
           for (int i = 0; i <= one.length()-1; i++) {
               char ch1 = one.charAt(i); // 123
               char ch2 = two.charAt(i); // abc
               result += "" + ch1 + ch2;
           }
           result = result + two.substring(one.length());
       }
      return result;

   }



}

