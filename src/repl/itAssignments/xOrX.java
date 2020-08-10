package repl.itAssignments;

public class xOrX {
    public static void main(String[] args) {
        String word = "xremedyx";

        String firstX=""+word.charAt(0);
        String lastX=""+word.charAt(word.length()-1);
        boolean xXOut=firstX.equalsIgnoreCase("x")&&lastX.equalsIgnoreCase("x");
        boolean firstXx=firstX.equalsIgnoreCase("x");
        boolean lastXx=lastX.equalsIgnoreCase("x");
        if(xXOut) {
            System.out.println(word.substring(1, word.length() - 1));
        }else if(firstXx){
            System.out.println(word.substring(1));
        }else if(lastXx){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }
















    }
}
