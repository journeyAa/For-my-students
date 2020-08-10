package day31_Recap;

public class warmUpTask {
    public static void main(String[] args) {
        String str = "aabccd";
        String uniques = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = frequency(str, ch);
            if (count == 1) {
                uniques += ch;
            }

        }
        // below is even simple version of the loops above
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        System.out.println(uniques);

// below is extra step

        char ch = str.charAt(0);  // this is just to see if the first ch is unique
        //  int count = 0;
        //  frequency(str, 'a');
        int count = frequency(str, 'a');
        //   System.out.println(count);
        if (count == 1) {
            uniques += ch;
        }


    }

    public static int frequency(String str, char ch) {// find the frequency char from String str
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str) { // frequency of every character

        String uniques = "";
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;

    }

}
