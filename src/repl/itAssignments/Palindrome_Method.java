package repl.itAssignments;

public class Palindrome_Method {
    public static void main(String[] args) {


    }
    public static boolean isPalindrome(String check){
        boolean isPalindrome = true;

        check = check.replaceAll(" ", "");
        String reverse = "";

        for (int i = check.length()-1; i>= 0 ; i--) {
            String str = "" + check.charAt(i);    // n u r s e s r u n
            reverse += str;
        }
        System.out.println(reverse);


        if(check.equalsIgnoreCase(reverse)){
            isPalindrome=true;
        }else{
            isPalindrome=false;
        }
       // System.out.println(isPalindrome);
        return isPalindrome;


    }


}
