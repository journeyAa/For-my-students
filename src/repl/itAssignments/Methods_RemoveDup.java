package repl.itAssignments;

public class Methods_RemoveDup {
    public static void main(String[] args) {
       String stri = "abccdffgiik";

        System.out.println(uniqueChars(uniqueChars(stri)));


    }
    public static String uniqueChars(String str){
        String nonDup = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String each = "" + str.charAt(i);  // s p o o n
            if (!nonDup.contains(each)) {  // s
                nonDup += each;
            }

        }
        return nonDup;
    }
}
