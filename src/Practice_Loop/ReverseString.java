package Practice_Loop;

// write a program that can reverse any string
public class ReverseString {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.next();
        String result = "";
                    //01234
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

         */

        String str = "Alalala";
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
           result += str.charAt(i); // the loop repeating from last char to the first one.

        }
        System.out.print(result);
        System.out.println();

        String result2 = "";
        int index = str.length()-1;
        while(index>=0){
            result2+=str.charAt(index);
            index--;
        }
        System.out.println(result2);

        String word = "hello";
        String word2 = "";
        for (int i = 0; i <= word.length()-1 ; i++) {
          word.charAt(i);
            System.out.println(word.charAt(i));

        }

        System.out.println(word2);
        System.out.println();
        System.out.println("==========================================================");

        int i = 80;
        while(i>=20){
            if(i%2==1){
                continue;
            }
            System.out.print(i+ " ");
            i--;
        }


















    }
}
