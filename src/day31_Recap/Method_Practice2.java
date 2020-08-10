package day31_Recap;

public class Method_Practice2 {
    public static void main(String[] args) {
        String name = "laallaal";
        String rev = reverse1(name);
        System.out.println(name==reverse1(name));




    }
    public static String reverse1(String str){
        String expectedResult = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            expectedResult+=ch;

        }
        return expectedResult;

    }



}
