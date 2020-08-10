package day10_ifStatement;

public class character_Identify {

    public static void main(String[] args) {

        char character = 'A';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

        String alphabet = "";

        if (isAlphabetic) {
            //  System.out.println(character + " is an Alphabetic letter");
            alphabet = character + " is Alphabetic character";
        } else{
            alphabet = character + " is not Alphabetic character";
        }
        System.out.println(alphabet);

        String digit = "";

        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit == false;
                // !isAlphabetic && !isDigit

        if(isDigit) {
            digit = character + " is a digit";
        } else {
            digit = character + " is not a digit";
        }

        System.out.println(digit);

        String specialCharacter = "";

        if(specialChar==true) {
            specialCharacter = character + " is a special character";
        } else {
            specialCharacter = character + " is not a special character";
        }
        System.out.println(specialCharacter);





    }




}
