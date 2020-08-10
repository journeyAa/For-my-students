package repl.itAssignments;

public class Methods_CoverMe {
    public static void main(String[] args) {
        String one = "Certified Wooden Spoon";
        String two = "o";
        System.out.println(coverString(one, two));

    }

    public static String coverString(String main, String coverMe) {
        if (!main.contains(coverMe)) {
            return ("[" + main + "]");
        } else {
            return  (main.replace(coverMe, "[" + coverMe + "]"));
        }

    }
}



