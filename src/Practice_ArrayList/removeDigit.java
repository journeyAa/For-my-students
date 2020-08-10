package Practice_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeDigit {
    public static void main(String[] args) {

        String str = "AABBCDEFGJJ";
        String unique = "";

        ArrayList<String>  list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        String nonDup = Util.removeDup(str);

        for (String each: nonDup.split("")){
            int count = Collections.frequency(list,each);{
                System.out.println(each+count);
            }

        }


        System.out.println("===========================================================");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b','2', '%', '#', '*', '?','8', '0' ));


        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(chars);
        digits.removeIf(p-> !Character.isDigit(p));  // if the character is not digit, remove it
        System.out.println("digits " + digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(chars);
        letters.removeIf(p-> !Character.isLetter(p)); // if the character is not letters
        System.out.println("letters " + letters);

        ArrayList<Character> specilChar = new ArrayList<>();
        specilChar.addAll(chars);
        specilChar.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        System.out.println("special chars " + specilChar);



    }
}
