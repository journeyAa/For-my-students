package repl.itAssignments;

public class Methods_ReverseString {
    public static void main(String[] args) {

        String input = "student";

        System.out.println( reverse(input));

        String inp1 = "kayak1";
        System.out.println( reverse(inp1));



    }
    public static String reverse(String input){
        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--) {
            char each = input.charAt(i);
            reverse += "" + each;

        }
        return  reverse;

    }
}
