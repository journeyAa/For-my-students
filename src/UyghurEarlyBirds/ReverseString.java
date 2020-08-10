package UyghurEarlyBirds;
// reverse any given string
public class ReverseString {
    public static void main(String[] args) {

        String str = "Uyghur";
        String result = "";


        for (int i = (str.length()-1); i >= 0 ; i--) {
            result+= str.charAt(i);
        }
        System.out.println(result);
        
        














    }
}
