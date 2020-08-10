package WarmUpTasks;

public class ArrayUniqueChracter {
    public static void main(String[] args) {
       String input = "aabccd";
       String unique ="";
       // expected result = "bd";

        for (int i = 0; i <= input.length()-1 ; i++) {
            String str = "" + input.charAt(i);//this checks each character from the given String
            // if the unique does not contain it, it should concate to the empty string
           if(!unique.contains(str)){
               unique+=str;

            }

        }
        System.out.println(unique);









    }
}
