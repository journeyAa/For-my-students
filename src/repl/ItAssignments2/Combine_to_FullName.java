package repl.ItAssignments2;

import java.util.Arrays;

public class Combine_to_FullName {
    public static void main(String[] args) {

      /*
      Complete the combineNames method to return a new String array that is composed of the first name and last name
       of each of the parameters.
first_names = {"Bulent","Ebrahim"}
last_names = {"Pola","Emam"}

returns a new String array with {"Bulent Pola",  "Ebrahim Emam"}
       */
        String[] first_names = {"Bulent", "Ebrahim"};
        String[] lastName = {"Pola", "Emam"};

        String[] fullName = new String[first_names.length];

        for (int i = 0; i <= fullName.length-1; i++) {
            fullName[i] = first_names[i] +" " + lastName[i];
        }

        System.out.println(Arrays.toString(fullName));














    }
}
