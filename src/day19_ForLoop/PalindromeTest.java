package day19_ForLoop;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "madam";

        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i--){
          //  reversedStr += str.charAt(i);
            reversedStr += str.substring(i, i+1);
        }
        System.out.println(reversedStr);

        System.out.println(str.equals(reversedStr));






















    }
}
