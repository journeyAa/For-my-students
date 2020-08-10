package Practice_Loop;

public class RemoveDuplicatesPractice {
    public static void main(String[] args) {

        String original = "abbccfdd";
        // index num ======01234567
        String nonDup = "";
      for (int i = 0; i < original.length()-1 ; i++) {
            String str = " " + original.charAt(i);//a  b c c f d d
            if(!nonDup.contains(str)){
                nonDup += str;
            }
        }
        System.out.println(nonDup);


        for (int i = 0; i <= original.length()-1 ; i++) {
            String str = "" + original.charAt(i);
            if(nonDup.contains(str)){
                continue;
            }
            nonDup+=str;

        }
        System.out.println(nonDup);




















    }
}
